/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author rashid.khitilov
 */
public class DuplicateCharsInString {

    public void findDuplicateChars(String str) {

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for (Character ch : chrs) {
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for (Character ch : keys) {
            if (dupMap.get(ch) > 1) {
                System.out.println(ch + "--->" + dupMap.get(ch));
            }
        }
    }

    public static void main(String a[]) {
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }
}
