package com.raval.autism.datamodel.calendar;

import java.util.Calendar;
import java.util.List;

import com.raval.autism.datamodel.AuditObject;

public class ActivityCalendar extends AuditObject {

    private List<ActivityDate> activityDates;

    private Calendar startDate;

    private Calendar endDate;

    private List<Season> seasons;

    public List<ActivityDate> getActivityDates() {
	return activityDates;
    }

    public void setActivityDates(List<ActivityDate> activityDates) {
	this.activityDates = activityDates;
    }

    public Calendar getStartDate() {
	return startDate;
    }

    public void setStartDate(Calendar startDate) {
	this.startDate = startDate;
    }

    public Calendar getEndDate() {
	return endDate;
    }

    public void setEndDate(Calendar endDate) {
	this.endDate = endDate;
    }

    public List<Season> getSeasons() {
	return seasons;
    }

    public void setSeasons(List<Season> seasons) {
	this.seasons = seasons;
    }

}
