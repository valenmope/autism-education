package com.raval.autism.datamodel;

import java.util.List;

public class ConductPolicy extends Policy {

    private List<ConductRule> rules;

    public List<ConductRule> getRules() {
	return rules;
    }

    public void setRules(List<ConductRule> rules) {
	this.rules = rules;
    }

}
