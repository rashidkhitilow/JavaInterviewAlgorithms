/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author rashid.khitilov
 */
public class FindMaxMinInArray {
     public static void main(String[] args) {

    }

    public static int findMaxInArray() {
        int[] a = {1, 2, 3, 2, 2, 4, 6, 8, 5, 9, 5, 67, 3, 87, 56};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

    public static int findMinInArray() {
        int[] a = {1, 2, 3, 2, 2, 4, 6, 8, 5, 9, 5, 67, 1, 3, 87, 56};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
