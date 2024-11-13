package com.fullapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.entities.Project;
import com.fullapp.services.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectAPI {
   @Autowired
   ProjectService pservice;
	@GetMapping("")
	public List<Project> getProjects() {
		return pservice.getProjects();
	}
}
