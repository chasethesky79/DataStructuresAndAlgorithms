package com.company.binarysearch;

public class Algorithm {

    public int binarySearch(final int[] input, final int value) {
        int low = 0;
        int high = input.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (input[mid] == value) {
                return mid;
            } else if (input[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
