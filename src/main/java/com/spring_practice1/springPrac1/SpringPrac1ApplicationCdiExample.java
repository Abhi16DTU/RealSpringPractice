package com.spring_practice1.springPrac1;

import com.spring_practice1.springPrac1.CdiPackage.CdiComponent;
import com.spring_practice1.springPrac1.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPrac1ApplicationCdiExample {

	public static void main(String[] args) {

		//what are the beans?
		//what are the dependencies of a bean?
		//where to search for beans? => no need


//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
//		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
		ApplicationContext applicationContext = SpringApplication.run(SpringPrac1ApplicationCdiExample.class, args);
		CdiComponent cdiComponent = applicationContext.getBean(CdiComponent.class);

		System.out.println(cdiComponent.getCdiJDBC());

	}

}
