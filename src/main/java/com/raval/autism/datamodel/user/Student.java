package com.raval.autism.datamodel.user;

import java.util.List;

import com.raval.autism.datamodel.Activity;
import com.raval.autism.datamodel.Transcript;

public class Student extends User {

    private List<Parent> parents; // mapped by Parent

    private Transcript transcript;

    private List<Activity> extraActivities;

    public List<Parent> getParents() {
	return parents;
    }

    public void setParents(List<Parent> parents) {
	this.parents = parents;
    }

    public Transcript getTranscript() {
	return transcript;
    }

    public void setTranscript(Transcript transcript) {
	this.transcript = transcript;
    }

    public List<Activity> getExtraActivities() {
	return extraActivities;
    }

    public void setExtraActivities(List<Activity> extraActivities) {
	this.extraActivities = extraActivities;
    }

}
