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
public class BubbleSort {
     public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];//2,
                    arr[j] = arr[j + 1];//0=1,
                    arr[j + 1] = temp;//1=2
                }
            }
        }
        return arr;
    }
     public static void main(String[] args) {
        int[] arrBubble = {2, 1, 34, 45, 23, 99, 56, -1, 0};
         bubbleSort(arrBubble);
         for (int i = 0; i < arrBubble.length; i++) {
             System.out.println(arrBubble[i]);
         }
    }
}
