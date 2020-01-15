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
public class SameNumberOfFactors {

    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));
    }

    static int sameNumberOfFactors(int n1, int n2) {

        if (n1 == n2) {
            return 1;
        }

        int countOfFactor1 = 0;
        int countOfFactor2 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                countOfFactor1++;
            }
        }

        for (int j = 1; j <= n2; j++) {
            if (n2 % j == 0) {
                countOfFactor2++;
            }
        }

        if (countOfFactor1 == countOfFactor2) {
            return 1;
        }
        return 0;
    }
}
