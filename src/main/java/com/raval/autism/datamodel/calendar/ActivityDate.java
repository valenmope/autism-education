package com.raval.autism.datamodel.calendar;

import com.raval.autism.datamodel.AuditObject;

public class ActivityDate extends AuditObject {

    private int startHour;

    private int endHour;

    public int getStartHour() {
	return startHour;
    }

    public void setStartHour(int startHour) {
	this.startHour = startHour;
    }

    public int getEndHour() {
	return endHour;
    }

    public void setEndHour(int endHour) {
	this.endHour = endHour;
    }

}
