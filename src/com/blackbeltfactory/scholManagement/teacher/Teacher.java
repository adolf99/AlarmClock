package com.blackbeltfactory.scholManagement.teacher;

import java.util.ArrayList;

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.room.Room;

public class Teacher {
    
    private String name;
    private Room room;
    private ArrayList<Courses> courses;
    
    public String getName() {
	return name;
    }
    
    public void setName(String firstName, String lastName) {
	this.name = firstName + lastName;
    }

    public Room getRoom() {
	return room;
    }

    public void setRoom(Room room, String nameRoom) {
	this.room = room;
	this.room.setNameRoom(nameRoom);
    }

    public ArrayList<Courses> getCourses() {
	return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
	this.courses = courses;
    }


}
