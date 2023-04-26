package sujeet.cs665.demo;

import java.util.ArrayList;
import java.util.List;

import sujeet.cs665.observerpattern.CourseObserver;

public class Course {
	private String title;
	private String description;
	private String syllabus;
	private String courses;
	private int enrollmentLimit;
	private List<Student> studentsEnrolled;
	private Faculty faculty;
	private List<Student> waitList;
	private int credits;
	private List<CourseObserver> observers;

	public Course(String title, String description, String syllabus, int credits, Faculty faculty,
			int enrollmentLimit) {
		this.title = title;
		this.description = description;
		this.syllabus = syllabus;
		this.credits = credits;
		this.faculty = faculty;
		this.enrollmentLimit = enrollmentLimit;
		this.studentsEnrolled = new ArrayList<>();
		this.waitList = new ArrayList<>();
	    this.observers = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public int getCredits() {
		return credits;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public List<Student> getEnrolledStudents() {
		return studentsEnrolled;
	}

	public int getEnrollmentLimit() {
		return enrollmentLimit;
	}

	public void enrollStudent(Student student) {
		if (studentsEnrolled.size() >= enrollmentLimit) {
			waitList.add(student);
			System.out.println("Course is full. " + student.getName() + " has been added to the waitlist.");
		} else {
			studentsEnrolled.add(student);
			System.out.println(student.getName() + " has been enrolled in " + title + ".");
		}
	}

	public void dropStudent(Student student) {
		studentsEnrolled.remove(student);
		System.out.println(student.getName() + " has been dropped from " + title + ".");
		if (waitList.size() > 0) {
			Student nextStudent = waitList.remove(0);
			studentsEnrolled.add(nextStudent);
			System.out.println(
					nextStudent.getName() + " has been automatically enrolled from the waitlist in " + title + ".");
			notifyChairperson();
		}
	}

	public void addObserver(CourseObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(CourseObserver observer) {
		observers.remove(observer);
	}

	private void notifyChairperson() {
		if (studentsEnrolled.size() == enrollmentLimit) {
			for (CourseObserver observer : observers) {
				observer.update(this);
			}
		}
	}

	public double calculateGPA() {
		double totalPoints = 0;
		int totalCredits = 0;
		for (Student student : studentsEnrolled) {
			totalPoints += student.getGradePoints(this) * credits;
			totalCredits += credits;
		}
		return totalPoints / totalCredits;
	}
}
