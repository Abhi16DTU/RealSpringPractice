package com.spring_practice1.springPrac1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort
        return numbers;
    }

}
