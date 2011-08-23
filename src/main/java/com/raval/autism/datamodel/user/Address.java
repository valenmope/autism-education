package com.raval.autism.datamodel.user;

import com.raval.autism.datamodel.AuditObject;
import java.util.Calendar;

public class Address extends AuditObject {

    private String description;

    private boolean active;

    private Calendar deactivationDate;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String region;

    private String country;

    private String zipCode;

    private String additionalInfo;

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    public Calendar getDeactivationDate() {
	return deactivationDate;
    }

    public void setDeactivationDate(Calendar deactivationDate) {
	this.deactivationDate = deactivationDate;
    }

    public String getAddressLine1() {
	return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
	return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getRegion() {
	return region;
    }

    public void setRegion(String region) {
	this.region = region;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getAdditionalInfo() {
	return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
	this.additionalInfo = additionalInfo;
    }

}
