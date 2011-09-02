package com.blackbeltfactory.scholManagement.teacher;


public class Teacher {
    
    private String name;
    
    public Teacher(String firstName, String lastName){
	this.name = firstName + lastName;
    }
    
    public String getName() {
	return name;
    }


}
