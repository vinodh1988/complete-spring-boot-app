package com.fullapp.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class Project {
  @Id
  private Integer projectno;
  @Column
  private String name;
  @Column
  private String technology;
  @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
  private Set<Member> members;
  
public Project() {
	super();
	// TODO Auto-generated constructor stub
}


public Project(Integer projectno, String name, String technology) {
	super();
	this.projectno = projectno;
	this.name = name;
	this.technology = technology;
}


Integer getProjectno() {
	return projectno;
}
void setProjectno(Integer projectno) {
	this.projectno = projectno;
}
String getName() {
	return name;
}
void setName(String name) {
	this.name = name;
}
String getTechnology() {
	return technology;
}
void setTechnology(String technology) {
	this.technology = technology;
}


Set<Member> getMembers() {
	return members;
}


void setMembers(Set<Member> members) {
	this.members = members;
}
  
  
}
