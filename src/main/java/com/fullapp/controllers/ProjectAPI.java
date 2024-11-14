package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Project;
import com.fullapp.services.ProjectService;
import com.fullapp.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/projects")
public class ProjectAPI {
   @Autowired
   ProjectService pservice;
	@GetMapping("")
	public List<Project> getProjects() {
		return pservice.getProjects();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> addProjects(@RequestBody Project project) throws RecordAlreadyExistsException {
		pservice.addProject(project);
		return new ResponseEntity<>(project,HttpStatus.CREATED);
	}
}
