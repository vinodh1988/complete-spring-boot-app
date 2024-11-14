package com.fullapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullapp.entities.Member;
import com.fullapp.entities.Project;
import com.fullapp.repositories.ProjectRepository;
import com.fullapp.utilities.RecordAlreadyExistsException;

@Service
public class ProjectService {
  @Autowired
  private ProjectRepository pr;
  
  public List<Project> getProjects() {
	  return pr.findAll();
  }
  
  public void addProject(Project p ) throws RecordAlreadyExistsException {
	  
		 Project project= pr.findByProjectno(p.getProjectno());
	     if(project!=null)
	    	 throw new RecordAlreadyExistsException();
	     for(Member m:p.getMembers()) { 
	    	 m.setProject(p);
	     }
	     pr.save(p);
  }
}
