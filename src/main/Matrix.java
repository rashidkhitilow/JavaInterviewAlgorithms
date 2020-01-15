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
public class Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        matrixWithCount(n);
        
    }
    public static void matrixWithCount(int matrixwidthlengthcount){
        for (int i = 0; i < matrixwidthlengthcount; i++) {
            for (int j = 1; j < matrixwidthlengthcount-i; j++) {
               System.out.print("2");
            }
            System.out.print("0");
            for (int j = 0; j < i; j++) {
               System.out.print("1");
           }
            System.out.println("");
        }
    }
}
