package br.com.drope.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.drope.hroauth.entities.User;
import br.com.drope.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) throws IllegalAccessException {
		User user = userFeignClient.findByEmail(email).getBody();
		
		if (user == null) {
			logger.error("Email not found: " + email);
			throw new IllegalAccessException("Email not found");
		}
		
		logger.info("Email found: " + email);
		return user;
	}
}
