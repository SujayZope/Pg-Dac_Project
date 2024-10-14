package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Cars_coming {


	private String carCompany;


	private String color;
	
	
	private LocalDate purchaseDate;
	
	
	
	private int owners;
	
	
	private Integer totalRunning;
	
	
	private String carModel;
	
	
	private String regno;

	private double price;
	
	
	
	private String city;
	
	

	
	private String state;
	
	

	
	private String pinNo;
	
	
	private String photo;
	
	
	int ccid;
//	String fname;


	public Cars_coming() {
		super();
		// TODO Auto-generated constructor stub
	}
public Cars_coming(String carCompany, String color, LocalDate purchaseDate, int owners, Integer totalRunning,
		String carModel, String regno, double price, String city, String state, String pinNo, String photo, int ccid) {
	super();
	this.carCompany = carCompany;
	this.color = color;
	this.purchaseDate = purchaseDate;
	this.owners = owners;
	this.totalRunning = totalRunning;
	this.carModel = carModel;
	this.regno = regno;
	this.price = price;
	this.city = city;
	this.state = state;
	this.pinNo = pinNo;
	this.photo = photo;
	this.ccid = ccid;
}
public String getCarCompany() {
	return carCompany;
}
public void setCarCompany(String carCompany) {
	this.carCompany = carCompany;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public LocalDate getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(LocalDate purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public int getOwners() {
	return owners;
}
public void setOwners(int owners) {
	this.owners = owners;
}
public Integer getTotalRunning() {
	return totalRunning;
}
public void setTotalRunning(Integer totalRunning) {
	this.totalRunning = totalRunning;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPinNo() {
	return pinNo;
}
public void setPinNo(String pinNo) {
	this.pinNo = pinNo;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public int getCcid() {
	return ccid;
}
public void setCCid(int ccid) {
	this.ccid = ccid;
}
@Override
public String toString() {
	return "Cars_coming [carCompany=" + carCompany + ", color=" + color + ", purchaseDate=" + purchaseDate + ", owners="
			+ owners + ", totalRunning=" + totalRunning + ", carModel=" + carModel + ", regno=" + regno + ", price="
			+ price + ", city=" + city + ", state=" + state + ", pinNo=" + pinNo + ", photo=" + photo + ", cid=" + ccid
			+ "]";
}


	
	
}
