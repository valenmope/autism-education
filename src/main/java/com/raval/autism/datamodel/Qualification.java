package com.raval.autism.datamodel;

import com.raval.autism.datamodel.user.Student;
import com.raval.autism.datamodel.user.Teacher;

public class Qualification {

	private String academicYear;

	private Activity activity;

	private Student student;

	private Teacher teacher;

	private String note;

	private QualificationType qualification;

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public QualificationType getQualification() {
		return qualification;
	}

	public void setQualification(QualificationType qualification) {
		this.qualification = qualification;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
}
