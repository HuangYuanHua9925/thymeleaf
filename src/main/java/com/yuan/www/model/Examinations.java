package com.yuan.www.model;

import java.io.Serializable;
import java.util.Date;

public class Examinations implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer studentId;
	
	private Integer score;
	
	private String questions;
	
	private String answers;
	
	private Date startExaminationTime;
	
	private Date endExaminationTime;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getStudentId() {
		return studentId;
	}

	
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	
	public Integer getScore() {
		return score;
	}

	
	public void setScore(Integer score) {
		this.score = score;
	}

	
	public String getQuestions() {
		return questions;
	}

	
	public void setQuestions(String questions) {
		this.questions = questions;
	}

	
	public String getAnswers() {
		return answers;
	}

	
	public void setAnswers(String answers) {
		this.answers = answers;
	}

	
	public Date getStartExaminationTime() {
		return startExaminationTime;
	}

	
	public void setStartExaminationTime(Date startExaminationTime) {
		this.startExaminationTime = startExaminationTime;
	}

	
	public Date getEndExaminationTime() {
		return endExaminationTime;
	}

	
	public void setEndExaminationTime(Date endExaminationTime) {
		this.endExaminationTime = endExaminationTime;
	}


	@Override
	public String toString() {
		return "Examinations [id=" + id + ", studentId=" + studentId
				+ ", score=" + score + ", questions=" + questions
				+ ", answers=" + answers + ", startExaminationTime="
				+ startExaminationTime + ", endExaminationTime="
				+ endExaminationTime + "]";
	}
}