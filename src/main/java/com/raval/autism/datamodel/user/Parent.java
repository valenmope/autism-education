package com.raval.autism.datamodel.user;

import java.util.List;

import com.raval.autism.datamodel.calendar.ActivityCalendar;

public class Parent extends User {

    private List<Student> students;

    private List<ActivityCalendar> availableTimetables;

    public List<Student> getStudents() {
	return students;
    }

    public void setStudents(List<Student> students) {
	this.students = students;
    }

    public List<ActivityCalendar> getAvailableTimetables() {
	return availableTimetables;
    }

    public void setAvailableTimetables(
	    List<ActivityCalendar> availableTimetables) {
	this.availableTimetables = availableTimetables;
    }

}
