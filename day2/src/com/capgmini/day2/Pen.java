package com.capgmini.day2;

public class Pen {

	@Override
	public String toString() {
		return "Pen [penName=" + this.penName + ", brand=" + this.brand + ", price=" + this.price + ", type="
				+ this.type + ", height=" + this.height + ", width=" + this.width + "]";
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Pen(String penName, String brand, int price, String type, int height, int width) {

		this.penName = penName;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.height = height;
		this.width = width;
	}

	String penName;
	String brand;
	int price;
	String type;
	int height;
	int width;

}
