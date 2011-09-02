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

package com.blackbeltfactory.scholManagement.start;

import java.util.ArrayList;

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.report.Report;
import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.student.Student;
import com.blackbeltfactory.scholManagement.teacher.Teacher;

/**
 * @author Andrew 
 *
 */
public class Main {
    
    private static Room a = new Room("A");
    private static Room b = new Room("B");
    
    private static Teacher rizzo = new Teacher("John ", "Rizzo");
    private static Teacher brasseur  = new Teacher("Nicolas ", "Brasseur");	
    private static Teacher delaux  = new Teacher("Vincent ", "Delvaux");

    private static Student carbonnelle = new Student("Frederic Carbonnelle");	
    private static Student guilbert = new Student("Murielle Guilbert");	
    private static Student poulson = new Student("James Poulson");		
    private static Student lorenzetti = new Student("Emmanuel Lorenzetti");
    
    /**
     * @param args
     */
    public static void main(String[] args) {

	Courses java = createCoursesJAVA();
	Courses oo = createCoursesOO();
	Courses jpa = createCoursesJPA();
	Courses js = createCoursesJS();

	ArrayList<Courses> listCourses = new ArrayList<Courses>();
	listCourses.add(java);
	listCourses.add(oo);
	listCourses.add(jpa);
	listCourses.add(js);
	
	Report report = new Report();
	
	/*1. Display the list of students who have had a course in a 
	 given room (room and course list given as parameters).*/	
//	report.reportStudentsInRoom(java, a);
//	report.reportStudentsInRoom(oo, a);
//	report.reportStudentsInRoom(oo, b);
//	report.reportStudentsInRoom(jpa, b);
//	report.reportStudentsInRoom(js, b);
	report.reportStudentsInRoom(listCourses, a);
	System.out.println();
	
	/*2. Display the list of the students who have been in 2 given 
	 rooms (2 rooms and a course list given as parameter).*/
//	report.reportStudentsInTwoRoom(listCourses, a);
//	report.reportStudentsInTwoRoom(listCourses, b);
	report.reportStudentsInTwoRoom(listCourses, a, b);
	System.out.println();
	/*3. Display the name of each teacher, followed by ":" and the list of its 
	 students separated by commas (list of courses given as parameter).*/
//	report.reportTeacherStudent(java);	
//	report.reportTeacherStudent(oo);
//	report.reportTeacherStudent(jpa);
//	report.reportTeacherStudent(js);
	report.reportTeacherStudent(listCourses);

    }
    
    private static Courses createCoursesJAVA(){
	Courses java = new Courses();
	java.setNameCourses("Java");
	java.setTeacher(rizzo);
	ArrayList<Student> javaStudent = new ArrayList<Student>();
	javaStudent.add(carbonnelle);
	java.setStudent(javaStudent);
	java.setRoom(a);
	return java;
    }
    
    private static Courses createCoursesOO(){
	Courses oo = new Courses();
	oo.setNameCourses("OO");
	oo.setTeacher(rizzo);
	ArrayList<Student> ooStudent = new ArrayList<Student>();
	ooStudent.add(carbonnelle);
	ooStudent.add(guilbert);
	ooStudent.add(lorenzetti);
	oo.setStudent(ooStudent);
	oo.setRoom(a);
	return oo;
    }
    
    private static Courses createCoursesJPA(){
	Courses jpa = new Courses();
	jpa.setNameCourses("JPA");
	jpa.setTeacher(brasseur);
	ArrayList<Student> jpaStudent = new ArrayList<Student>();
	jpaStudent.add(guilbert);
	jpaStudent.add(poulson);
	jpaStudent.add(lorenzetti);
	jpa.setStudent(jpaStudent);
	jpa.setRoom(b);
	return jpa;
    }
    
    private static Courses createCoursesJS(){
	Courses javaScript = new Courses();
	javaScript.setNameCourses("JavaScript");
	javaScript.setTeacher(delaux);
	ArrayList<Student> javaScriptStudent = new ArrayList<Student>();
	javaScriptStudent.add(poulson);
	javaScriptStudent.add(lorenzetti);
	javaScript.setStudent(javaScriptStudent);
	javaScript.setRoom(b);
	return javaScript;
    }

}
