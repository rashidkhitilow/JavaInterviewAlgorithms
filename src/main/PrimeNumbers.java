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
public class PrimeNumbers {

    public static void main(String[] args) {
        //find prime numbers , prime numbers is divede to itself and 1;ex: 2,3,5,7,11,13,17,19.....
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPrimeNumber(num));
        for (int i = 2; i < num; i++) {
            if(isPrimeNumber(i)) System.out.println(i);
        }
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
