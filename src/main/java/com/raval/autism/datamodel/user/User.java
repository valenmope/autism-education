package com.raval.autism.datamodel.user;

import com.raval.autism.datamodel.AuditObject;
import java.net.URL;
import java.util.List;

public class User extends AuditObject {

    private Contact contact;

    private List<Address> address;

    private Profile profile;

    private URL picture;

    private GenderType gender;

    public Contact getContact() {
	return contact;
    }

    public void setContact(Contact contact) {
	this.contact = contact;
    }

    public List<Address> getAddress() {
	return address;
    }

    public void setAddress(List<Address> address) {
	this.address = address;
    }

    public Profile getProfile() {
	return profile;
    }

    public void setProfile(Profile profile) {
	this.profile = profile;
    }

    public URL getPicture() {
	return picture;
    }

    public void setPicture(URL picture) {
	this.picture = picture;
    }

    public GenderType getGender() {
	return gender;
    }

    public void setGender(GenderType gender) {
	this.gender = gender;
    }

}
