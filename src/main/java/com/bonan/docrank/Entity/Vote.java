package com.bonan.docrank.Entity;

import java.util.Date;

public class Vote {
	private long id;
	private Date date;
	private byte score;
	private String comment;
	private User user;
	private Doctor doctor;
	
	
	/**
	 * @param date
	 * @param score
	 * @param comment
	 * @param user
	 * @param doctor
	 */
	public Vote(Date date, byte score, String comment, User user, Doctor doctor) {
		super();
		this.date = date;
		this.score = score;
		this.comment = comment;
		this.user = user;
		this.doctor = doctor;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the score
	 */
	public byte getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(byte score) {
		this.score = score;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}
	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
