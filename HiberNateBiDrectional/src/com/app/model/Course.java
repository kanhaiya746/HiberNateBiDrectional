package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="cor1")
public class Course {
@Id
private int corId;
@ManyToMany(mappedBy="cor")
List<Student> st;
public Course() {
	super();
}
public int getCorId() {
	return corId;
}
public void setCorId(int corId) {
	this.corId = corId;
}
public List<Student> getSt() {
	return st;
}
public void setSt(List<Student> st) {
	this.st = st;
}
@Override
public String toString() {
	return "Course [corId=" + corId + ", st=" + st + "]";
}	
}
