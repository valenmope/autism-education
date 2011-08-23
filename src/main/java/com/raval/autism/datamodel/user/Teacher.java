package com.raval.autism.datamodel.user;

import java.util.List;

import com.raval.autism.datamodel.calendar.ActivityCalendar;

public class Teacher extends User {

    private List<ActivityCalendar> parentsTutorships;

    public List<ActivityCalendar> getParentsTutorships() {
	return parentsTutorships;
    }

    public void setParentsTutorships(List<ActivityCalendar> parentsTutorships) {
	this.parentsTutorships = parentsTutorships;
    }

}
