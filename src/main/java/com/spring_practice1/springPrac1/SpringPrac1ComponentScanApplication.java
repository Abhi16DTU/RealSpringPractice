package com.spring_practice1.springPrac1;

import ComponentPackage.ComponentDAO;
import com.spring_practice1.springPrac1.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ComponentPackage")
public class SpringPrac1ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPrac1ComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringPrac1ComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbc2Connection());

	}

}
