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
public class GCD {

    public static void main(String[] args) {
        System.out.println(GCD(22, 60));
    }

    public static int GCD(int a, int b) {
        int t = 0;
        while (b != 0) {
            t = a;//22,60,22,16,6,4
            a = b;//60,22,16,6,4,2
            b = t % b;//22,16,6,4,2,0
        }
        return a;
    }
}
