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
public class Fibanocci {
     public static void main(String[] args) {
        System.out.println(FibanocciRec(8));
        System.out.println(fibanocciWithFor(8));
        System.out.println(allFabonacciNumbers(8));

    }

    public static int fibanocciWithFor(int nthFibanocci) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        int result = 0;
        for (int i = 1; i <= nthFibanocci; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            result = num3;
        }
        return result;
    }
    public static String allFabonacciNumbers(int stillnthFibanocci) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

       String allNum=num1+" "+num2+" ";
        for (int i = 1; i <= stillnthFibanocci; i++) {
            num3 = num1 + num2;
            allNum+=num3+" ";
            num1 = num2;
            num2 = num3;
        }
        return allNum;
    }

    public static int FibanocciRec(int number) {
        //base part
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } //recursion part
        else {
            return FibanocciRec(number - 1) + FibanocciRec(number - 2);
        }
    }
}
