package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentdata")
@Scope("prototype")
public class Student {
	@Value("Harsh Tiwari")
	private String studentName;

	@Value("14")
	private int rno;

	@Value("#{sublist}")
	private List<String> subjects;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rno=" + rno + ", subjects=" + subjects + "]";
	}
}
