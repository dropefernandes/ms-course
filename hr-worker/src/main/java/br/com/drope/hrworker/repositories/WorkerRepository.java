package br.com.drope.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
