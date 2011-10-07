package com.raval.autism.datamodel;

import java.util.List;

import com.raval.autism.datamodel.user.Student;

public class Transcript extends AuditObject {

	private Student student;

	private List<Qualification> qualifications;
}