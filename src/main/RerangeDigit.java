/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author rashid.khitilov
 */
public class RerangeDigit {

    public static int Rearrange(int N) {
        int result = -404;
        //write your Logic here:
        String numStr = N + "";
        char[] numCharArr = numStr.toCharArray();
        int[] numArr = new int[numStr.length()];

        for (int i = 0; i < numCharArr.length; i++) {
            numArr[i] = Integer.parseInt(numCharArr[i] + "");
        }

        // Sort in descending order
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < i; j++) {

                if (numArr[i] > numArr[j]) {
                    // swap
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }

            }
        }

        String largestNumber = "";
        for (int i : numArr) {
            largestNumber += i;
        }
        Integer myResult = Integer.valueOf(largestNumber);
        return myResult;
    }

    public static void main(String[] args) {
        System.out.print(Rearrange(526742345));
    }
}
