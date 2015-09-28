package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.beans.Person;
import com.spring.mvc.beans.Person.Car;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	Person p ;
	
	
	
	@RequestMapping("/getPerson")
	public Person getPerson(HttpServletRequest httpServletRequest){
		p.setAge(httpServletRequest.getParameter("age"));
		p.setId(httpServletRequest.getParameter("id"));
		p.setName(httpServletRequest.getParameter("name"));
		Car car1 = new Car();
		car1.setBrand("Audi");
		car1.setPrice(100000);
		Car car2 = new Car();
		car2.setBrand("benz");
		car2.setPrice(2000000);
		
		p.getMapCar().put(12345, car1);
		p.getMapCar().put(88888, car2);
		
		return p;
	}

}
