package com.bonan.docrank.Entity;


public class Establishment {

	private int id;
	private String name, zipCode, webSiteUrl, address, telephone;

	
	/**
	 * @param name name of the institution
	 * @param zipCode zip code of the establishment
	 * @param webSiteUrl url of the web site of the institution
	 * @param address address of the establishment
	 * @param telephone telephone of the establishment
	 */
	public Establishment(String name, String zipCode, String webSiteUrl, String address, String telephone) {
		super();
		this.id = 0;
		this.name = name;
		this.zipCode = zipCode;
		this.webSiteUrl = webSiteUrl;
		this.address = address;
		this.telephone = telephone;
	}

	/**
	 * @return the id of establishment
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the ID to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name the name of the institution
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name of the institution
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the zipCode of the institution
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode of the institution
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the institution web site url
	 */
	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	/**
	 * @param webSiteUrl the url of the web site of the institution
	 */
	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

	/**
	 * @return the address of the institution
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address of the institution
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the telephone of the institution
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone of the institution
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	 	
	
}
