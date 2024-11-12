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

Integer getComputerId() {
	return computerId;
}
void setComputerId(Integer computerId) {
	this.computerId = computerId;
}
String getBrand() {
	return brand;
}
void setBrand(String brand) {
	this.brand = brand;
}
String getRam() {
	return ram;
}
void setRam(String ram) {
	this.ram = ram;
}
String getCpu() {
	return cpu;
}
void setCpu(String cpu) {
	this.cpu = cpu;
}
String getDisk() {
	return disk;
}
void setDisk(String disk) {
	this.disk = disk;
}
   
   
}
