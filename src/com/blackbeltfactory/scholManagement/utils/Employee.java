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

package com.blackbeltfactory.scholManagement.utils;

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.teacher.Teacher;

/**
 * @author Andrew 
 *
 */
public class Employee {

    private Teacher teacher;
    private Courses courses;
    private Room room;
    
    public Employee(){
	
    }
    
    public void setTeacher(Teacher teacher){
	this.teacher = teacher;
    }
    
    public Teacher getTeacher(){
	return teacher;
    }
    
    public void setCourses(Courses courses){
	this.courses = courses;
    }
    
    public Courses getCourses(){
	return courses;
    }
    
    public void setRoom(Room room, String nameRoom){
	this.room = room;
	this.room.setNameRoom(nameRoom);
    }
    
    public Room getRoom(){
	return room;
    }
}
