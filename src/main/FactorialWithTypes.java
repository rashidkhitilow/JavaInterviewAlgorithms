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
public class FactorialWithTypes {
    public static int factorialWithWhile(int a) {
        int t = 1;
        while (a != 0) {

            t *= a;
            a--;
        }
        return t;
    }

    public static int factorialWithFor(int a) {
        int t = 1;
        for (int i = 1; i <= a; i++) {
            t *= i;
        }
        return t;
    }
    
    public static int FactorialWithRecursion(int a){
        
        if(a==0) return 1;
        else return a*factorialWithFor(a-1);
    }
}
