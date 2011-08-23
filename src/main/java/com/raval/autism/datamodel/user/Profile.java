package com.raval.autism.datamodel.user;

import com.raval.autism.datamodel.AuditObject;
import java.util.List;

public class Profile extends AuditObject {

    private String name;

    private List<Rol> roles;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<Rol> getRoles() {
	return roles;
    }

    public void setRoles(List<Rol> roles) {
	this.roles = roles;
    }

}
