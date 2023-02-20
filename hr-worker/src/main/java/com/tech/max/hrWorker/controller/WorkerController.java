package com.tech.max.hrWorker.controller;

import com.tech.max.hrWorker.model.Worker;
import com.tech.max.hrWorker.repositories.WorkerRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/workers")
public class WorkerController {

    @Autowired
    private  WorkerRepository repository;

    @GetMapping("")
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getOne(@PathVariable Integer id){
        Optional<Worker> byId = repository.findById(id.longValue());

        return ResponseEntity.ok(byId.orElse(null));
    }
}
