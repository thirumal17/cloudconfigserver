package com.example.demo.model;

public class Student {
private String name;
private int sid;
private String grade;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "Student [name=" + name + ", sid=" + sid + ", grade=" + grade + "]";
}

}
