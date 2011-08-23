package com.raval.autism.datamodel;

import java.util.Calendar;

public class AuditObject {

    // TODO convertir los calendar a String

    private Integer id;

    private Calendar auditCreationDate;

    private String auditCreationUser;

    private Calendar auditUpdateDate;

    private String auditUpdateUser;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Calendar getAuditCreationDate() {
	return auditCreationDate;
    }

    public void setAuditCreationDate(Calendar auditCreationDate) {
	this.auditCreationDate = auditCreationDate;
    }

    public String getAuditCreationUser() {
	return auditCreationUser;
    }

    public void setAuditCreationUser(String auditCreationUser) {
	this.auditCreationUser = auditCreationUser;
    }

    public Calendar getAuditUpdateDate() {
	return auditUpdateDate;
    }

    public void setAuditUpdateDate(Calendar auditUpdateDate) {
	this.auditUpdateDate = auditUpdateDate;
    }

    public String getAuditUpdateUser() {
	return auditUpdateUser;
    }

    public void setAuditUpdateUser(String auditUpdateUser) {
	this.auditUpdateUser = auditUpdateUser;
    }

}
