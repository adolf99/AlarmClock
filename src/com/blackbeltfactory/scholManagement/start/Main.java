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

import com.blackbeltfactory.scholManagement.courses.Courses;
import com.blackbeltfactory.scholManagement.room.Room;
import com.blackbeltfactory.scholManagement.student.Student;
import com.blackbeltfactory.scholManagement.teacher.Teacher;
import com.blackbeltfactory.scholManagement.utils.Utils;

/**
 * @author Andrew 
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Utils utils = new Utils();
	Teacher rizzo = new Teacher();
	Teacher brasseur  = new Teacher();
	Teacher delaux  = new Teacher();
	utils.setTeach(rizzo, "John", "Rizzo");
	utils.setTeach(brasseur, "Nicolas", "Brasseur");
	utils.setTeach(delaux, "Vincent", "Delvaux");
	
	Student carbonnelle = new Student();
	Student guilbert = new Student();
	Student poulson = new Student();
	Student lorenzetti = new Student();
	utils.setStudent(carbonnelle, "Frederic", "Carbonnelle");
	utils.setStudent(guilbert, "Murielle", "Guilbert");
	utils.setStudent(poulson, "James", "Poulson");
	utils.setStudent(lorenzetti, "Emmanuel", "Lorenzetti");
	
	Courses java = new Courses();
	Courses oo = new Courses();
	Courses jpa = new Courses();	
	Courses javaScript = new Courses();
	utils.setCourses(java, "Java");
	utils.setCourses(oo, "OO");
	utils.setCourses(jpa, "JPA");
	utils.setCourses(javaScript, "JavaScript");
	
	Room a = new Room();
	Room b = new Room();	
	utils.setRomm(a, "A");
	utils.setRomm(b, "B");	
	
/*Привязка TEACHER in the ROOM*/
	rizzo.setRoom(a);	
	brasseur.setRoom(b);	
	delaux.setRoom(b);
	
/*Привязка COURSES in the TEACHER*/	
	java.setTeacher(rizzo);	
	oo.setTeacher(rizzo);
	jpa.setTeacher(brasseur);
	javaScript.setTeacher(delaux);
	
	

    }

}
