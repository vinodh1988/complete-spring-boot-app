package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Computer;
import com.fullapp.repositories.ComputerRepository;
import com.fullapp.utilities.RecordAlreadyExistsException;
import com.fullapp.utilities.RecordNotFoundException;

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
  
  public Computer getComputer(Integer computerid) throws RecordNotFoundException {
	  Computer c = crepo.findByComputerId(computerid);
	  if(c!=null)
		  return c;
	  throw new RecordNotFoundException();
  }
  public void addComputer(Computer computer) throws RecordAlreadyExistsException
  {
	    Computer c = crepo.findByComputerId(computer.getComputerId());
	    if(c!=null)
	    	throw new RecordAlreadyExistsException();
	    crepo.save(computer); //generate insert
  }
  
  public void updateComputer(Integer computerId,Computer computer) throws RecordNotFoundException
  {
	    Computer c = crepo.findByComputerId(computerId);
	    if(c==null)
	    	throw new RecordNotFoundException();
	    computer.setComputerId(computerId);
	    computer.setBrand(computer.getBrand()==null?c.getBrand():computer.getBrand());
	    computer.setCpu(computer.getCpu()==null?c.getCpu():computer.getCpu());
	    computer.setDisk(computer.getDisk()==null?c.getDisk():computer.getDisk());
	    computer.setRam(computer.getRam()==null?c.getRam():computer.getRam());
	    crepo.save(computer); //generate insert
  }
}
