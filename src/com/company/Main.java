package com.company;

import com.company.binarysearch.Algorithm;

public class Main {

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        System.out.println("Binary search index "+ algorithm.binarySearch(new int[]{ 1, 2, 3, 4, 5, 6, 7 }, 7));
    }
}
