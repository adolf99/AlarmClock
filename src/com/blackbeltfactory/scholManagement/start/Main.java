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
import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.student.Student;
import com.blackbeltfactory.scholManagement.teacher.Teacher;

/**
 * @author Andrew 
 *
 */
public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	Courses jav = new Courses();
	jav.setNameCourses("Java");
	
	Courses oo = new Courses();
	oo.setNameCourses("OO");
	
	Courses jpa = new Courses();
	jpa.setNameCourses("JPA");
	
	Courses javaScript = new Courses();	
	javaScript.setNameCourses("JavaScript");
	
	ArrayList<Courses> rizCou = new ArrayList<Courses>();	
	rizCou.add(jav);
	rizCou.add(oo);	
	
	Teacher rizzo = new Teacher();
	rizzo.setName("John ", "Rizzo");
	rizzo.setRoom( new Room(), "A");
	rizzo.setCourses(rizCou);
	
	Teacher brasseur  = new Teacher();
	brasseur.setName("Nicolas ", "Brasseur");
	brasseur.setRoom(new Room(), "B");
	setTeacherArray(jpa, brasseur);
	
	Teacher delaux  = new Teacher();
	delaux.setName("Vincent ", "Delvaux");
	delaux.setRoom(new Room(), "B");
	setTeacherArray(javaScript, delaux);
	
	
	
	Student carbonnelle = new Student();
	carbonnelle.setName("Frederic Carbonnelle");
	ArrayList<Courses> carList = new ArrayList<Courses>();
	carList.add(jav);
	carList.add(oo);
	carbonnelle.setCourses(carList);
	
	Student guilbert = new Student();
	guilbert.setName("Murielle Guilbert");
	ArrayList<Courses> guiList = new ArrayList<Courses>();
	guiList.add(oo);
	guiList.add(jpa);
	guilbert.setCourses(guiList);
	
	Student poulson = new Student();
	poulson.setName("James Poulson");
	ArrayList<Courses> poulList = new ArrayList<Courses>();
	poulList.add(jpa);
	poulList.add(javaScript);
	poulson.setCourses(poulList);
	
	Student lorenzetti = new Student();	
	lorenzetti.setName("Emmanuel Lorenzetti");
	ArrayList<Courses> lorList = new ArrayList<Courses>();
	lorList.add(oo);
	lorList.add(jpa);
	lorList.add(javaScript);
	lorenzetti.setCourses(lorList);
	
	
	
	ArrayList<Student> stud = new ArrayList<Student>();
	stud.add(carbonnelle);
	stud.add(guilbert);
	stud.add(poulson);
	stud.add(lorenzetti);

	
	reportTeacher(rizzo, stud);
	reportTeacher(brasseur, stud);
	reportTeacher(delaux, stud);
	

    }
    
    private static void reportTeacherStudent(Courses course, Teacher teacher){
	ArrayList<Courses> coursTeacher = teacher.getCourses();
	for(Courses cour : coursTeacher){
	    //System.out.println(course.);
	}
    }
    
    private static void reportTeacher(Teacher teacher, ArrayList<Student> student){
	ArrayList<Courses> qw = teacher.getCourses();
	System.out.println("Teacher " + teacher.getName() + " work in the room " + teacher.getRoom().getNameRoom() + " : ");
	for(int i=0; i< qw.size(); i++){	   
	    for(int k=0; k < student.size(); k++){
		for(int j=0; j < student.get(k).getCourses().size(); j++){
		    if(qw.get(i) == student.get(k).getCourses().get(j)){
		     System.out.println("   " + student.get(k).getName() + " - "+ student.get(k).getCourses().get(j).getNameCourses());
		    }
		}
	    }
	}
    }
    
    private static void setTeacherArray(Courses cours, Teacher teacher){
	ArrayList<Courses> delCou = new ArrayList<Courses>();
	delCou.add(cours); 
	teacher.setCourses(delCou);
    }

}
