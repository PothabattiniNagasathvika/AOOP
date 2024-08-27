package com.student.information;

public class EnrollmentService implements IEnrollmentService {

	@Override
	public void enrollStudentInCourse(IStudent student, ICourse course) {
		// TODO Auto-generated method stub
		 student.enrollInCourse(course);
	        course.enrollStudent(student);
		
	}

}
