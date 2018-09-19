package com.niit.globalbooks.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product implements Serializable 
{

@Id
private int productId;
private String productName;
private double price;
private int quantity;
private String description;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
private String image;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

}


