package com.spring_practice1.springPrac1;

import com.spring_practice1.springPrac1.basic.BinarySearchImpl;
import com.spring_practice1.springPrac1.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPrac1Applicationproperties {

	public static void main(String[] args) {

		//what are the beans?
		//what are the dependencies of a bean?
		//where to search for beans? => no need


//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
//		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
//
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrac1Applicationproperties.class);
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

		System.out.println(someExternalService.getUrl());


	}

}
