package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Computer;
import com.fullapp.repositories.ComputerRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ComputerService {
  @Autowired
  private ComputerRepository crepo; // the implementation of ComputerRepo
           
  
  //is done by DATA JPA and the object is injected dynamically
  @PostConstruct
  public void show() {
	  System.out.println("#####JPA Implementation Class:"+crepo.getClass().getName());
  }
  public List<Computer> getComputers() {
	  return crepo.findAll();
  }
}
