package com.spring_practice1.springPrac1;

import com.spring_practice1.springPrac1.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringPrac1Application {

	public static void main(String[] args) {

		//what are the beans?
		//what are the dependencies of a bean?
		//where to search for beans? => no need


//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
//		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrac1Application.class);
//		ApplicationContext applicationContext = SpringApplication.run(SpringPrac1Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
		applicationContext.close();
	}

}
