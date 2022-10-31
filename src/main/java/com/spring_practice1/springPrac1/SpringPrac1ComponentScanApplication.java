package com.spring_practice1.springPrac1;

import ComponentPackage.ComponentDAO;
import com.spring_practice1.springPrac1.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@ComponentScan("ComponentPackage")
@Configuration
@ComponentScan("ComponentPackage")
public class SpringPrac1ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPrac1ComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrac1ComponentScanApplication.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbc2Connection());

	}

}
