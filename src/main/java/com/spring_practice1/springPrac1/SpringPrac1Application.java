package com.spring_practice1.springPrac1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrac1Application {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
		SpringApplication.run(SpringPrac1Application.class, args);
	}

}
