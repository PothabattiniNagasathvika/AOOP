package com.student.information;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
	private String id;
    private String name;
    private List<IStudent> enrolledStudents = new ArrayList<>();

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        }
	
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void enrollStudent(IStudent student) {
		// TODO Auto-generated method stub
		enrolledStudents.add(student);
	}

	public List<IStudent> getEnrolledStudents() {
		// TODO Auto-generated method stub
		return enrolledStudents;
	}

}
