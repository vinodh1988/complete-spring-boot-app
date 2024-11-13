package com.fullapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Computer {
	@Id
   private Integer computerId;
	@Column
   private String brand;
	@Column
   private String ram;
	@Column
   private String cpu;
	@Column
   private String disk;
   


public Computer() {
	super();
}


public Computer(Integer computerId, String brand, String ram, String cpu, String disk) {
	super();
	this.computerId = computerId;
	this.brand = brand;
	this.ram = ram;
	this.cpu = cpu;
	this.disk = disk;
}

public Integer getComputerId() {
	return computerId;
}
public void setComputerId(Integer computerId) {
	this.computerId = computerId;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public  String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getDisk() {
	return disk;
}
public void setDisk(String disk) {
	this.disk = disk;
}
   
   
}
