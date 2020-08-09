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
public class SortMap {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Rashid");
        students.put(3, "Cosqun");
        students.put(2, "Ulvi");
        Set<Integer> keys = students.keySet();

        for (int key : keys) {
            System.out.println(key + " " + students.get(key));
        }
    }
    
}
