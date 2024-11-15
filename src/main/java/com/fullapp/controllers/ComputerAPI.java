package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fullapp.entities.Computer;
import com.fullapp.services.ComputerService;
import com.fullapp.utilities.RecordAlreadyExistsException;
import com.fullapp.utilities.RecordNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/computers")
@Tag(name = "Computer API", description="All the operations of Computer entity")
public class ComputerAPI {
	@Autowired
	private ComputerService cservice;
	
  @GetMapping("")
  public List<Computer> getComputers() {
	  return cservice.getComputers();
  }

  @Operation(
		   summary="Get Computer by computer no",
		   description="Get Computer by passing conputer number "
		)
		@ApiResponses(
			 value = {
					 @ApiResponse(responseCode="200", description="Computer object Matched"),
					 @ApiResponse(responseCode="400", description="if No computer exists with the id"),
					 @ApiResponse(responseCode="500", description="Server related error")
			 }	
			)
  @GetMapping("/{computerId}")
  public ResponseEntity<Object> getComputer(@PathVariable Integer computerId) throws RecordNotFoundException {
	 
		  Computer c=cservice.getComputer(computerId);
		  return new ResponseEntity<>(c,HttpStatus.OK);
	
  }
  @PostMapping("")
  public ResponseEntity<Object> addComputer(@RequestBody Computer computer) throws RecordAlreadyExistsException {
	
		  cservice.addComputer(computer);
		  RestTemplate restTemplate=new RestTemplate();
		  String url="http://localhost:9090/api/message?message="+computer.toString();
		  String response=restTemplate.getForObject(url, String.class);
		  return new ResponseEntity<>(computer,HttpStatus.CREATED);
	 
	
  }
 
  @RequestMapping(value="/{computerId}",method= {RequestMethod.PUT,RequestMethod.PATCH})
  public ResponseEntity<Object> putComputer(@PathVariable Integer computerId,@RequestBody Computer computer) throws RecordNotFoundException
  {
	  cservice.updateComputer(computerId, computer);
	  return new ResponseEntity<>("computer Updated",HttpStatus.OK);
  }
  
  @DeleteMapping("/{computerId}")
  public ResponseEntity<Object> deleteComputer(@PathVariable Integer computerId) throws RecordNotFoundException
  {
	  cservice.deleteComputer(computerId);
	  return new ResponseEntity<>("computer deleted",HttpStatus.OK);
  }
}
