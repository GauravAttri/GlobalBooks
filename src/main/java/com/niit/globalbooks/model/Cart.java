package com.niit.globalbooks.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Cart implements Serializable
{
	@Id
    @GeneratedValue
private int cartId;
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<CartItems>cartItems;
	@OneToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
private Customer customer;
private double grandTotal;





public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public List<CartItems> getCartItems() {
	return cartItems;
}
public void setCartItems(List<CartItems> cartItems) {
	this.cartItems = cartItems;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public double getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(double grandTotal) {
	this.grandTotal = grandTotal;
}

}
