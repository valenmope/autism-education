package com.raval.autism.datamodel.calendar;

import com.raval.autism.datamodel.AuditObject;

public class Season extends AuditObject {

    private String name;

    private int startDayOfYear;

    private int endDayOfYear;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getStartDayOfYear() {
	return startDayOfYear;
    }

    public void setStartDayOfYear(int startDayOfYear) {
	this.startDayOfYear = startDayOfYear;
    }

    public int getEndDayOfYear() {
	return endDayOfYear;
    }

    public void setEndDayOfYear(int endDayOfYear) {
	this.endDayOfYear = endDayOfYear;
    }

}
