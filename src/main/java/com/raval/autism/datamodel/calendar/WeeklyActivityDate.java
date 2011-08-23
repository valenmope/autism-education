package com.raval.autism.datamodel.calendar;

import java.util.List;

public class WeeklyActivityDate extends ActivityDate {

    private List<Integer> daysOfWeek;

    public List<Integer> getDaysOfWeek() {
	return daysOfWeek;
    }

    public void setDaysOfWeek(List<Integer> daysOfWeek) {
	this.daysOfWeek = daysOfWeek;
    }

}
