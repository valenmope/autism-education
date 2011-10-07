package com.raval.autism.datamodel;

import java.util.List;
import java.util.Map;

import com.raval.autism.datamodel.user.Student;
import com.raval.autism.datamodel.user.Teacher;

public class Classroom extends AuditObject {

	private String name;

	private Map<Activity, Teacher> activities;

	private List<Student> students;

	private Teacher tutor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Activity, Teacher> getActivities() {
		return activities;
	}

	public void setActivities(Map<Activity, Teacher> activities) {
		this.activities = activities;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Teacher getTutor() {
		return tutor;
	}

	public void setTutor(Teacher tutor) {
		this.tutor = tutor;
	}

}
