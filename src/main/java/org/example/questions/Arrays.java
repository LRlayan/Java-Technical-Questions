package org.example.questions;

public class Arrays {

    public void FindDuplicateCount() {
        int[] arr = { 5, 2, 6, 4, 8, 5, 4, 2, 5, 6, 5, 3, 7 };
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
}
