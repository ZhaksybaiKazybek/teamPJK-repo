package com.project.deliver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	String product;
	String location;
	String date;
	
	protected ProductOrder(){}
	
	public ProductOrder(String product, String location, String date){
		this.product = product;
		this.location = location;
		this.date = date;
	}
	
	public Long getId(){
		return id;
	}
	public String getProduct(){
		return product;
	}
	public String getLocation(){
		return location;
	}
	public String getDate(){
		return date;
	}
	public void setProduct(String product){
		this.product = product;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public void setDate(String date){
		this.date = date;
	}
	
}