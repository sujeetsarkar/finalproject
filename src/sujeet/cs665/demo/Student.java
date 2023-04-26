package sujeet.cs665.demo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
    String program;
	private String id;
	private String enrolledProgram;
//	private String enrolledCertificate;
//	private String enrolledCourses;
	List<Course> coursesTaken;
	private Course thesis;
	private Faculty thesisAdvisor;
	
	public Student(String name, String program) {
        this.name = name;
        this.program = program;
        this.coursesTaken = new ArrayList<>();
        this.thesis = null;
        this.thesisAdvisor = null;
    }
	
	public void enrollCourse(Course course) {
        course.enrollStudent(this);
        coursesTaken.add(course);
    }
    
    public void dropCourse(Course course) {
        course.dropStudent(this);
        coursesTaken.remove(course);
    }
    public double gpa() {
        int totalCredits = 0;
        int totalGradePoints = 0;
        for (Course course : coursesTaken) {
            totalCredits += course.getCredits();
            totalGradePoints += course.getFaculty().getGradePoints(course, this) * course.getCredits();
        }
        return 0;
    }
    public String getName() {
    	return name;
    }
    
	public void getEnrolledCourses() {
		
	}
	
	public void getEnrolledProgram() {
		
	}
	
	public void getEnrolledCertificate() {
		
	}
	
	public void getThesis() {
		
	}
	
	public void getThesisAdvisor() {
		
	}
}
