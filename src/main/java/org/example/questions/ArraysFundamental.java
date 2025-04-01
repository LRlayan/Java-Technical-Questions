package org.example.questions;

import java.util.Arrays;

public class ArraysFundamental {

    int[] arr = { 5, 2, 6, 4, 8, 5, 4, 2, 5, 6, 5, 3, 7 };

    public void FindDuplicateCount() {
        boolean[] checked = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!checked[i]) {
                int num = arr[i];
                int count = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (num == arr[j]) {
                        count++;
                        checked[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println("Number " + num + " Duplicate count " + count);
                } else {
                    System.out.println("Number " + num + " No Duplicates ");
                }
            }
        }
    }

    public void RemoveDuplicatesFromArray() {

//        using inbuilt method
        int[] uniqueAr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueAr));

        int[] ar = RemoveDuplicates();
        System.out.println(Arrays.toString(ar));
    }

    public int[] RemoveDuplicates() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = 0;
        int[] uniAr = new int[arr.length];
        uniAr[index] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniAr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(uniAr));
        return Arrays.copyOf(uniAr, index);
    }

    public void ReverseArrays() {
        String[] arr = { "one", "two", "three", "four", "five" };

        System.out.println("Before : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("After : " + Arrays.toString(arr));
    }
}
