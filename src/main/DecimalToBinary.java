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
        printBinaryFormat(25);
    }
}
