package com.student.information;
import java.util.ArrayList;
import java.util.List;
public class Student  implements IStudent{
	 private String id;
	    private String name;
	    private List<ICourse> enrolledCourses = new ArrayList<>();

	    public Student(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void enrollInCourse(ICourse course) {
		 enrolledCourses.add(course);
		
	}

}
