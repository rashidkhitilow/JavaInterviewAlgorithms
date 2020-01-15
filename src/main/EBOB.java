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
public class EBOB {

    public static void main(String[] args) {
        System.out.println(GCD(6, 24));
//        System.out.println(GCDWithRecursion(34, 12));
    }

    public static int GCD(int first, int second) {
        while (first != 0 && second != 0) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return Math.max(first, second);
    }

    //Greatest Common Divisor with Recursion
    static int GCDWithRecursion(int first, int second) {
        //base part
        if (first == 0) {
            return second;
        }

        //recursion part
        if (first > second) {
            return GCDWithRecursion(second, first - second);
        } else {
            return GCDWithRecursion(second, second - first);
        }
    }
}
