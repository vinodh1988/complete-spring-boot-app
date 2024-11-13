package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Project;
import com.fullapp.repositories.ProjectRepository;

@Service
public class ProjectService {
  @Autowired
  private ProjectRepository pr;
  
  public List<Project> getProjects() {
	  return pr.findAll();
  }
}
