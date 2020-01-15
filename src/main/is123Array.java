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
public class is123Array {

    public static void main(String[] args) {

        System.out.println(is123Array(new int[]{1, 2, 3, 2, 1}));
        System.out.println(is123Array(new int[]{0, 1, 2, 3, 1, 2, 3}));
        System.out.println(is123Array(new int[]{1, 3, 2}));
        System.out.println(is123Array(new int[]{1, 3, 3, 2, 1}));
        System.out.println(is123Array(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}));
        System.out.println(is123Array(new int[]{}));
        System.out.println(is123Array(new int[]{1, 2, 3}));
        System.out.println(is123Array(new int[]{2}));
    }

    static int is123Array(int[] a) {
        int ret = 0;
        int count = 0;
        int invalidvlue = 0;
        for (int i = 0, j = i + 1; i < a.length && j < a.length; i++, j++) {
            {
                if (a[i] == 1 && a[j] == 2 && a[j + 1] == 3) {
                    count += 3;
                } else {
                    invalidvlue++;
                }
                i += 2;
                j += 2;
            }

        }
        if (count == a.length) {
            ret = 1;
        }
        return ret;
    }
}
