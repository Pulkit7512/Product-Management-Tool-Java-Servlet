package com.nagarro.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "product")

public class Product {
	@Id
	String title;
	int quantity;
	int size;
	String image;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Product() {	}
	
	public Product(String title, int quantity, int size, String image) {
		this.title = title;
		this.quantity = quantity;
		this.size = size;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", quantity=" + quantity + ", size=" + size + ", image="
				+ image + "]";
	}
}
