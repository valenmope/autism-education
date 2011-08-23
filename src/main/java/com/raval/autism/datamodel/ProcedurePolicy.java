package com.raval.autism.datamodel;

import java.util.List;

public class ProcedurePolicy extends Policy {

    private List<ProcedureStep> steps;

    public List<ProcedureStep> getSteps() {
	return steps;
    }

    public void setSteps(List<ProcedureStep> steps) {
	this.steps = steps;
    }

}
