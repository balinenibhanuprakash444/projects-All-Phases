package com.bean;

import java.util.Objects;

public class Product {
private int pid;
private String pname;
private float price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

@Override
public int hashCode() {
	return Objects.hash(pid, pname, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return pid == other.pid && Objects.equals(pname, other.pname)
			&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}

}
