package com.nationwide.shoppinglist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test1 {
	@Id
//	@GeneratedValue
	private String item;
	private int quantity;
	private float price;
	private float total;
	private boolean purchased;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public boolean isPurchased() {
		return purchased;
	}
	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}
}

