package com.spring_practice1.springPrac1.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Implementing Binary Search
        // Sorting the array
        // Search the array
        // Return the result
        int res[] = sortAlgorithm.sort(numbers);


        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        // here we do some initialization of the bean , like setting up some values
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        // here we do some cleanup of the bean , like closing some connections
        logger.info("preDestroy");
    }


}
