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

package com.blackbeltfactory.scholManagement.report;

import java.util.ArrayList;

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.student.Student;
import com.blackbeltfactory.scholManagement.teacher.Teacher;

/**
 * @author Andrew 
 *
 */
public class Report {

    public void reportStudentsInRoom(ArrayList<Courses> listCourses, Room room) {
	ArrayList<Student> students = new ArrayList<Student>();
	
	for(Courses course : listCourses ){
	    if(course.getRoom() == room){
		for(Student student : course.getStudent()){
		    if(!students.contains(student)){
		    System.out.println("Room name is " + room.getNameRoom() +" students is : " + student.getName());
		    }
		}
	    }
	}
    }
    
    public void reportStudentsInRoom(Courses courses, Room room) {
	ArrayList<Student> lengthCourses = courses.getStudent();
	
	if(courses.getRoom() == room){
	    System.out.println("Room name is " + room.getNameRoom() + " students is :" + setStr(lengthCourses));	    
	}
	else{
	    System.out.println(courses.getNameCourses() + " course is not read in your room " + room.getNameRoom());
	}
    }

    public void reportTeacherStudent(Courses courses){
	ArrayList<Student> lengthCourses = courses.getStudent();
	System.out.println(courses.getTeacher().getName() + " read courses is " + 
		courses.getNameCourses() + " students is :" + setStr(lengthCourses));
    }

    public void reportTeacherStudent(ArrayList<Courses> listCourses) {
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

/*Перебираем весь список курсов*/	
	for(Courses courses : listCourses){
/*Проверяем на вхождение courses.getTeacher() в массив teachers*/	    
	    if(!teachers.contains(courses.getTeacher())){
/*Заполняем массив учителями*/
		teachers.add(courses.getTeacher());
	    }
	}
	for(Teacher teacher : teachers){
	    teacherStudents(teacher, listCourses);
	}    
    }
/*поиск всех студентов по учителю*/    
    private void teacherStudents(Teacher teacher, ArrayList<Courses> courses){
	ArrayList<Student> students = new ArrayList<Student>();
	
	for (Courses course : courses) {
	    if (course.getTeacher().equals(teacher)) {
		for (Student student : course.getStudent()) {
		    if ( !students.contains(student)) {
			students.add(student);
		    }
		}
	    }
	}
	System.out.println(teacher.getName() + ": " + setStr(students) );	
    }

    public void reportStudentsInTwoRoom(ArrayList<Courses> listCourses, Room a, Room b) {
	ArrayList<Student> studentsRoomA = findStudentRoom(listCourses, a);
	ArrayList<Student> studentsRoomB = findStudentRoom(listCourses, b);	
	ArrayList<Student> studentsInBothRooms = new ArrayList<Student>();
	
	for (Student student : studentsRoomA) {
		if (studentsRoomB.contains(student)) {
			studentsInBothRooms.add(student);
		}
	}
	System.out.println("Students in both rooms: " + setStr(studentsInBothRooms) );	
    }
    
    public void reportStudentsInTwoRoom(ArrayList<Courses> listCourses, Room room) {
	ArrayList<Student> studentsRoom = findStudentRoom(listCourses, room);
	
	System.out.println(room.getNameRoom() + ": " + setStr(studentsRoom) );	
    }
    private ArrayList<Student> findStudentRoom(ArrayList<Courses> listCourses, Room room){
	ArrayList<Student> students = new ArrayList<Student>();
	for (Courses course : listCourses) {
	    if(course.getRoom() == room){
		for (Student student : course.getStudent()) {
		    if ( !students.contains(student)) {
			students.add(student);
		    }
		}
	    }
	}
	return students;
    }

    private String setStr(ArrayList<Student> students){
	String str= "";
	for(int i = 0; i < students.size(); i++){
	    str = str + students.get(i).getName() + ", ";
	}
	return str;
    }
}
