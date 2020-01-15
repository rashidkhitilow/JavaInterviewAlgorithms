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
public class FindFirstAndLastNumberSum {

    public static void main(String[] args) {
        findSum(18);
    }

    public static void findSum(int i) {
        int num = i;
        int sum = 0;
        while (i != 0 && i > 9) {
            i = i / 10;
            sum = i;
        }
        sum += num % 10;
        System.out.println(sum);
    }
}
