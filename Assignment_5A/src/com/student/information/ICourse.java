package com.student.information;
import java.util.List;

public interface ICourse {
	String getId();
    String getName();
    List<IStudent> getEnrolledStudents();
	void enrollStudent(IStudent student);
	

}
