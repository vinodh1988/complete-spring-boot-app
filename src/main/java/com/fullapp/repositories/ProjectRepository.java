package com.fullapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullapp.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
