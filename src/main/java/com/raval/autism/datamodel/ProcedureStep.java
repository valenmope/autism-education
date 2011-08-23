package com.raval.autism.datamodel;

import java.net.URI;

public class ProcedureStep extends AuditObject {

    private String name;

    private Integer order;

    private URI image;

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

    public URI getImage() {
	return image;
    }

    public void setImage(URI image) {
	this.image = image;
    }

}
