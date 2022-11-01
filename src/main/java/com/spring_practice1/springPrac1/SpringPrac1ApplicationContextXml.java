package com.spring_practice1.springPrac1;

import com.spring_practice1.springPrac1.XmlPrac.XmlPersonDao;
import com.spring_practice1.springPrac1.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
//@Configuration
//@ComponentScan
public class SpringPrac1ApplicationContextXml {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPrac1ApplicationContextXml.class);

	public static void main(String[] args) {

		//what are the beans?
		//what are the dependencies of a bean?
		//where to search for beans? => no need


//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
//		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrac1ApplicationContextXml.class);
////		ApplicationContext applicationContext = SpringApplication.run(SpringPrac1Application.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch.binarySearch(new int[] {1,2,3,4,5}, 3));
//		applicationContext.close();



		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());


		XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
		System.out.println(xmlPersonDao);

	}

}
