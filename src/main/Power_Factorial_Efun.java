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
public class Power_Factorial_Efun {
    
    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(factorial(5));
        System.out.println(efun(6));
    }

    public static int power(int number, int pw) {//2^3=2*2*2
        if (pw == 0) {
            return 1;
        } else {
            return number * power(number, pw - 1);
        }
    }

    public static int factorial(int number) {//3!=3*2*1
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static int efun(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * efun(number - 2);
        }
    }
}
