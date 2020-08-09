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
public class DecimalToBinary {

    public static void printBinaryFormat(int number) {
        int binary[] = new int[number];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
//        printBinaryFormat(439);
        maximumNumberOfConsecutive1();
    }
//    Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

    public static void maximumNumberOfConsecutive1() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        int t=0;
        while (n > 0) {
            if (n % 2 == 1) {
                counter++;
                if(counter>=t){
                    t=counter;
                }
            } else {
                counter = 0;
            }
            n = n / 2;
        }
        System.out.println(t);
    }
}
