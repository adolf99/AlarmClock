/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blackbeltfactory.scholManagement.courses;

import java.util.ArrayList;

import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.student.Student;
import com.blackbeltfactory.scholManagement.teacher.Teacher;

/**
 * @author Andrew 
 *
 */
public class Courses {
    
    private String nameCourses; 
    private Teacher teacher;
    private ArrayList<Student> student;
    private Room room;
    
    
    public String getNameCourses() {
	return nameCourses;
    }
    
    public void setNameCourses(String nameCourses) {
	this.nameCourses = nameCourses;
    }

    public Teacher getTeacher() {
	return teacher;
    }

    public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
    }

    public ArrayList<Student> getStudent() {
	return student;
    }

    public void setStudent(ArrayList<Student> student) {
	this.student = student;
    }

    public Room getRoom() {
	return room;
    }

    public void setRoom(Room room) {
	this.room = room;
    }

}
