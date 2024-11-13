package com.fullapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="members")
public class Member {
  @Id
  private Integer memberid;
  @Column
  private String name;
  @Column
  private String experience;
  
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "projectno")
  @JsonIgnore
  private Project project;
  
  public Member() {}
public Member(Integer memberid, String name, String experience) {
	super();
	this.memberid = memberid;
	this.name = name;
	this.experience = experience;
}
public Integer getMemberid() {
	return memberid;
}
public void setMemberid(Integer memberid) {
	this.memberid = memberid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
  

  
}
