/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rashid.khitilov
 */
public class Anagrams {
    static final int NO_OF_CHARS = 256;

    /* function to check whether two 
	strings are anagram of each other */
    static boolean areAnagram(String str1, String str2) {
        int[] count = new int[NO_OF_CHARS];
        int i;
        for (i = 0; i < str1.length() && i < str2.length();
                i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    static void findAllAnagrams(List<String> arr) {
        List<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (areAnagram(arr.get(i), arr.get(j))) {
                    if (!newArr.contains(arr.get(i))) {
                        newArr.add(arr.get(i));
                    }
                } else {
                    if (!newArr.contains(arr.get(j))) {
                        newArr.add(arr.get(j));
                    }
                }
            }
        }
    }

    /* Driver program to test to pront printDups*/
    public static void main(String args[]) {
    }
}
