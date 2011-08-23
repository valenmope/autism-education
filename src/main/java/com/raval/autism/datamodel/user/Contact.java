package com.raval.autism.datamodel.user;

import com.raval.autism.datamodel.AuditObject;
import java.util.List;

public class Contact extends AuditObject {

    private String name;

    private String surname1;

    private String surname2;

    private String fiscalId;

    private String email;

    private List<String> fixedPhones;

    private List<String> mobilePhones;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSurname1() {
	return surname1;
    }

    public void setSurname1(String surname1) {
	this.surname1 = surname1;
    }

    public String getSurname2() {
	return surname2;
    }

    public void setSurname2(String surname2) {
	this.surname2 = surname2;
    }

    public String getFiscalId() {
	return fiscalId;
    }

    public void setFiscalId(String fiscalId) {
	this.fiscalId = fiscalId;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public List<String> getFixedPhones() {
	return fixedPhones;
    }

    public void setFixedPhones(List<String> fixedPhones) {
	this.fixedPhones = fixedPhones;
    }

    public List<String> getMobilePhones() {
	return mobilePhones;
    }

    public void setMobilePhones(List<String> mobilePhones) {
	this.mobilePhones = mobilePhones;
    }

}
