package com.bonan.docrank.Entity;

public class Doctor {
	
	private String name, lastname;
	private Integer registrationNumber;
	private Establishment[] establishments;
	private Specialty[] specialties;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the registrationNumber
	 */
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}
	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	/**
	 * @return the establishments
	 */
	public Establishment[] getEstablishments() {
		return establishments;
	}
	/**
	 * @param establishments the establishments to set
	 */
	public void setEstablishments(Establishment[] establishments) {
		this.establishments = establishments;
	}
	/**
	 * @return the specialties
	 */
	public Specialty[] getSpecialties() {
		return specialties;
	}
	/**
	 * @param specialties the specialties to set
	 */
	public void setSpecialties(Specialty[] specialties) {
		this.specialties = specialties;
	}
	
	
	
	

}
