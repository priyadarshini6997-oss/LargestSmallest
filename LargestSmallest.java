package com.index;

public class LargestSmallest {
    public static void main(String[] args) {

        int[] a = {5, 2, 9, 1, 7};

        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}



