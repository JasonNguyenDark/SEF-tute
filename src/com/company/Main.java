package com.company;

public class Main {

    public static void bubbleSort(Double a[]) {
        int n = a.length;

        for (int i = 0; i <= (n-1); i++) {
            for (int j = 0; j <= (n-i-1); j++) {

                if (a[j] > a[j+1]) {

                   Double tmp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = tmp;
                }
            }
        }

    }

    public static void printArray(Double a[]) {
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
	    // write your code here
        Double a[] = {70.0, 61.0, 72.0, 83.0, 38.0};
        bubbleSort(a);
        printArray(a);
    }
}
