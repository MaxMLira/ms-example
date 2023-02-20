package com.tech.max.hrWorker.repositories;

import com.tech.max.hrWorker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
