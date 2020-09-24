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
public class StrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "llo";
//        System.out.println(strStr(haystack, needle));
        System.out.println(strStr2("ceoydefthf5iyg5h5yts", "codefights"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle.length() > haystack.length()) {
            return -1;
        }
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static boolean strStr2(String characterSelection, String word) {
        String currentWord = "";
        int wordIndex = 0;
        char[] chars = characterSelection.split('');
    
    for (let   char of   {
            chars
        }
        )
        {
            if (char == = word[wordIndex]) {
                currentWord = currentWord.concat(char);
                wordIndex++;
            }

            if (currentWord == = word) {
                return true;
            }
        }

        return false;
    }
}
