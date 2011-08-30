package com.blackbeltfactory.scholManagement.teacher;

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.room.Room;

public class Teacher {
    
    private String firstName;
    private String lastname;
    private Courses courses;
    private Room room;
    
    public String getFirstName() {
	return firstName;
    }
    
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    
    public String getLastname() {
	return lastname;
    }
    
    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public Courses getCourses() {
	return courses;
    }

    public void setCourses(Courses courses) {
	this.courses = courses;
    }

    public Room getRoom() {
	return room;
    }

    public void setRoom(Room room) {
	this.room = room;
    }

}
