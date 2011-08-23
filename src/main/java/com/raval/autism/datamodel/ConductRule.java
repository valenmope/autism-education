package com.raval.autism.datamodel;

import java.net.URI;
import java.net.URL;

public class ConductRule extends AuditObject {

    private String name;

    private Integer order;

    private URL rightConduct;

    private URI wrongConduct;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getOrder() {
	return order;
    }

    public void setOrder(Integer order) {
	this.order = order;
    }

    public URL getRightConduct() {
	return rightConduct;
    }

    public void setRightConduct(URL rightConduct) {
	this.rightConduct = rightConduct;
    }

    public URI getWrongConduct() {
	return wrongConduct;
    }

    public void setWrongConduct(URI wrongConduct) {
	this.wrongConduct = wrongConduct;
    }

}
