package com.example.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.lab1");

		Car car = context.getBean("car", Car.class);
		System.out.printf("\nCrank size is %d x %d\n", car.getBody().getItem().getHeight(),
				car.getBody().getItem().getWidth());
		System.out.printf("\nCrank pocket contain a %s\n", car.getBody().getItem().getName());
		System.out.printf("\nSeats in car %d", car.getCabin().getSeats());
		System.out.printf("\nEngine is %d pistons and %d\n L", car.getEngine().getPiston(),
				car.getEngine().getVolume());
		System.out.printf("\nSar's name is %s!\n", car.getName());

	}
}