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
public class SameWithReverse {

    public static void main(String[] args) {
        boolean a = checkIsSameString("ana");
        System.out.println(a);
    }

    public static boolean checkIsSameString(String word) {
        boolean b = true;
        if (word.isEmpty()) {
            b = false;
        } else {

            for (int i = 0; i < word.length(); i++) {
                b = word.charAt(i) == word.charAt(word.length() - 1 - i);
                if (b == false) {
                    break;
                }
            }
        }
        return b;
    }
}
