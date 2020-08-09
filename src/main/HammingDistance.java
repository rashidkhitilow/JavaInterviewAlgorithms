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
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        int setBits = 0;

        while (n > 0) {
            setBits += n & 1;
            n >>= 1;
        }

        return setBits;
    }

    public static void main(String[] args) {
        int n1 = 1, n2 = 4;
        System.out.println(hammingDistance(n1, n2));
    }
}
