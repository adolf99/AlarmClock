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

package com.blackbeltfactory.scholManagement.student;

import java.util.ArrayList;

import com.blackbeltfactory.scholManagement.courses.Courses;

/**
 * @author Andrew 
 *
 */
public class Student {
    
    private String name;
    private ArrayList<Courses> courses;
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }

    public ArrayList<Courses> getCourses() {
	return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
	this.courses = courses;
    }
  

    
}
