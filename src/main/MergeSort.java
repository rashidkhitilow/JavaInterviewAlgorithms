/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

/**
 *
 * @author rashid.khitilov
 */
public class MergeSort {

    public static void main(String[] args) {
//        System.out.println(GCD(20, 60));
//        System.out.println(20 % 60);
//        countdown(5);
//        System.out.println(power(2, 4));
//        System.out.println(factorial(5));
//        System.out.println(efun(8));
        /*
        int[] arr = {1, 2, 3};
        List alist = new ArrayList<>();
        alist.add(5);
        alist.add("A");
        List llist = new LinkedList<>();
        llist.add(5);
        llist.add("fdgdsg");
        llist.add('a');
         */
        int[] arrBubble = {2, 1, 34, 45, 23, 99, 56, -1, 0};
//
        System.out.println(Arrays.toString(mergeSort(arrBubble)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left_arr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right_arr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] new_arr = new int[left_arr.length + right_arr.length];

        int left = 0;
        int right = 0;
        int curr = 0;

        while (left < left_arr.length || right < right_arr.length) {
            if (left < left_arr.length && (right == right_arr.length || left_arr[left] < right_arr[right])) {
                new_arr[curr++] = left_arr[left++];
            } else if (right < right_arr.length && (left == left_arr.length || right_arr[right] < left_arr[left])) {
                new_arr[curr++] = right_arr[right++];
            }
        }

        return new_arr;
    }

    public static int[] mergeSort2(int[] arr) {

        if (arr.length > 1) {
            int mid = arr.length;
            int[] leftArr = new int[mid / 2];
            int[] rightArr = new int[mid - (mid / 2)];
            for (int i = 0; i < mid / 2; i++) {
                leftArr[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                rightArr[i] = arr[i];
            }
            mergeSort(leftArr);
            mergeSort(rightArr);
            int i1 = 0;
            int j1 = 0;
            int k = 0;
            while (i1 < leftArr.length && j1 < rightArr.length) {
                if (leftArr[i1] < rightArr[j1]) {
                    arr[k] = leftArr[i1];
                    i1 += 1;
                } else {
                    arr[k] = rightArr[j1];
                    j1 += 1;
                }
                k += 1;
            }

        }
        return arr;
    }
}
