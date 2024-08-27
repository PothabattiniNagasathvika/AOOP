package com.student.information;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStudent student1 = new Student("S001", "Alice");
        IStudent student2 = new Student("S002", "Bob");

        // Creating courses
        ICourse course1 = new Course("C001", "Mathematics");
        ICourse course2 = new Course("C002", "Science");

        // Creating enrollment service
        IEnrollmentService enrollmentService = new EnrollmentService();

        // Enrolling students in courses
        enrollmentService.enrollStudentInCourse(student1, course1);
        enrollmentService.enrollStudentInCourse(student2, course2);

        // Displaying enrolled students in each course
        System.out.println("Students enrolled in " + course1.getName() + ":");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students enrolled in " + course2.getName() + ":");
        for (IStudent student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
	}

}
}
