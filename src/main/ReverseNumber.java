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
public class ReverseNumber {

    public static int numberReverse(int number) {//201
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);//0,0,2
            number = number / 10;//20,2,0
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(numberReverse(201));
    }
}
