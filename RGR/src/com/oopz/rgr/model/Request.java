package com.oopz.rgr.model;

public class Request {
	private double cost;
	private String name;
	
	public Request(double cost, String name) {
		this.cost = cost;
		this.name = name;
	}
	
	public void setCost(double cost) {
		if(cost > 0)
			this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return getClass().getName() + "[cost=" + cost + ", name=" + name + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null || object instanceof Request) {
			Request another = (Request) object;
			return cost == another.cost && name.equals(another.name);
		}
		return false;
	}
}
