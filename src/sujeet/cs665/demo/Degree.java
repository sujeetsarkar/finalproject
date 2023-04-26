/**
 * 
 */
package sujeet.cs665.demo;

import java.util.List;

/**
 * @author iamsu
 *
 */
public class Degree {
	private String programName;
	private String type;
	private List<Course> coreCourses;
	private List<Course> electiveCourses;
	private Faculty thesisAdvisor;
	
	public void addCoreCourse() {
		
	}
	
	public void addElectiveCourse() {
		
	}
	
	public List<Course> getCoreCourses() {
		return coreCourses;
	}
	
	public List<Course> getElectiveCourses() {
		return electiveCourses;
	}
	
	public Faculty getThesisAdvisor() {
		return thesisAdvisor;
	}
}
