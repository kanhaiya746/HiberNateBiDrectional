package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stu")
public class Student {
@Id
private int StuId;
private String stuName;
private String stuBranch;
@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="eidfk")
List<Course> cor;

public Student() {
	super();
}
public int getStuId() {
	return StuId;
}
public void setStuId(int stuId) {
	StuId = stuId;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getStuBranch() {
	return stuBranch;
}
public void setStuBranch(String stuBranch) {
	this.stuBranch = stuBranch;
}
public List<Course> getCor() {
	return cor;
}
public void setCor(List<Course> cor) {
	this.cor = cor;
}
@Override
public String toString() {
	return "Student [StuId=" + StuId + ", stuName=" + stuName + ", stuBranch=" + stuBranch + ", cor=" + cor + "]";
}	
}
