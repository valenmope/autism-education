package com.raval.autism.datamodel;

import java.util.List;

import com.raval.autism.datamodel.user.Student;

public class Transcript extends AuditObject {

	private Student student;

	private List<Qualification> qualifications;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
}