package com.spring_practice1.springPrac1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        // Logic for Bubble Sort
        return numbers;
    }

}
