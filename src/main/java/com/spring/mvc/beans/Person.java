package com.spring.mvc.beans;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude
public class Person {
	
	private String name;
	private String id;
	private String age;
	
	private Map<Integer,Car> mapCar = new TreeMap<Integer, Car>();
	
	
	
	
	
	public Map<Integer, Car> getMapCar() {
		return mapCar;
	}
	public void setMapCar(Map<Integer, Car> mapCar) {
		this.mapCar = mapCar;
	}
	public static class Car{
		private String brand;
		private int price;
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
		
		
		
	}
	  
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
