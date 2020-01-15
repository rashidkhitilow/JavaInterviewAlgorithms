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
public class CountDown {
    public static void main(String[] args) {
        countdown(5);
    }
        public static void countdown(int a) {
        if (a == 0) {
            System.out.println("Done");
            return;
        } else {
            System.out.println(a + "...");
            countdown(a - 1);
            System.out.println("foo");
        }
    }
}
