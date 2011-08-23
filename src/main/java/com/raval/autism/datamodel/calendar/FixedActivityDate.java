package com.raval.autism.datamodel.calendar;

import java.util.Calendar;
import java.util.List;

public class FixedActivityDate extends ActivityDate {

    private List<Calendar> fixedDates;

    public List<Calendar> getFixedDates() {
	return fixedDates;
    }

    public void setFixedDates(List<Calendar> fixedDates) {
	this.fixedDates = fixedDates;
    }

}
