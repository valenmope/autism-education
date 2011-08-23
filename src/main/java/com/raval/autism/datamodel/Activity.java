package com.raval.autism.datamodel;

import java.net.URI;
import java.util.List;

import com.raval.autism.datamodel.calendar.ActivityCalendar;

public class Activity extends AuditObject {

    private String name;

    private URI image;

    private List<Policy> policies;

    private List<ActivityCalendar> scheduler;

    private List<ActivityCalendar> rectificationScheduler;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public URI getImage() {
	return image;
    }

    public void setImage(URI image) {
	this.image = image;
    }

    public List<Policy> getPolicies() {
	return policies;
    }

    public void setPolicies(List<Policy> policies) {
	this.policies = policies;
    }

    public List<ActivityCalendar> getScheduler() {
	return scheduler;
    }

    public void setScheduler(List<ActivityCalendar> scheduler) {
	this.scheduler = scheduler;
    }

    public List<ActivityCalendar> getRectificationScheduler() {
	return rectificationScheduler;
    }

    public void setRectificationScheduler(
	    List<ActivityCalendar> rectificationScheduler) {
	this.rectificationScheduler = rectificationScheduler;
    }

}
