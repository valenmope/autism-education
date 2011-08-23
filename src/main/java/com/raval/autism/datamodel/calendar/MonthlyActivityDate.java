package com.raval.autism.datamodel.calendar;

import java.util.List;

public class MonthlyActivityDate extends ActivityDate {

    private List<Integer> daysOfMonth;

    public List<Integer> getDaysOfMonth() {
	return daysOfMonth;
    }

    public void setDaysOfMonth(List<Integer> daysOfMonth) {
	this.daysOfMonth = daysOfMonth;
    }

}
