package com.websystique.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.websystique.spring.domain.Application;
import com.websystique.spring.domain.Bond;
import com.websystique.spring.domain.Driver;
import com.websystique.spring.domain.Employee;
import com.websystique.spring.domain.Performer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AppMain {
	@Autowired
	Application application;
	@Autowired
	Employee employee;
	@Autowired
	Performer performer;
	@Autowired
	Driver driver;
	@Autowired
	Bond bond;

	@PostConstruct
	public void init() {
		System.out.println("Application Details : " + application);
		System.out.println("Employee Details : " + employee);
		System.out.println("Performer Details : " + performer);
		System.out.println("Driver Details : " + driver);
		bond.showCar();
	}

	public static void main(String args[]) {
		SpringApplication.run(AppMain.class, args);
	}

}
