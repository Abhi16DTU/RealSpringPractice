package com.spring_practice1.springPrac1;

import com.spring_practice1.springPrac1.basic.BinarySearchImpl;
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
@Configuration
@ComponentScan
public class SpringPrac1ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPrac1ScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrac1ScopeApplication.class);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
	}

}
