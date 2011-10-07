package com.raval.autism.datamodel;

import java.util.List;

public class Course extends AuditObject {

	private String academicYear;

	private List<Classroom> classrooms;

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public List<Classroom> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}

}