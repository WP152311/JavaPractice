/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	// Getter
	public String  getCompany(){
		return company;
	}
	
	public String  getModel(){
		return model;
	}
	
	public String  getColor(){
		return color;
	}
	
	public int  getMaxSpeed(){
		return maxSpeed;
	}
	
	public int  getPrice(){
		return price;
	}
	
	// Setter
	public void  setCompany(String company){
		this.company = company;
	}
	
	public void  setModel(String model){
		this.model = model;
	}
	
	public void  setColor(String color){
		this.color = color;
	}
	
	public void  setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	public void  setPrice(int price){
		this.price = price;
	}

}
