package com.example.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.lab1.details.Body;
import com.example.lab1.details.Cabin;
import com.example.lab1.details.Engine;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.lab1");

		Car car = context.getBean("car", Car.class);
		Body body = context.getBean("body", Body.class);
		Cabin cabin = context.getBean("cabin", Cabin.class);
		Engine engine = context.getBean("engine", Engine.class);
		System.out.printf("\nCrank size is %d x %d\n", body.getItem().getHeight(),
				body.getItem().getWidth());
		System.out.printf("\nCrank pocket contain a %s\n", body.getItem().getName());
		System.out.printf("\nSeats in car %d", cabin.getSeat());
		System.out.printf("\nEngine is %d pistons and %d\n L", engine.getPiston(),
				engine.getVolume());
		System.out.printf("\nSar's name is %s!\n", car.getName());

	}
}