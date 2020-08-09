/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author rashid.khitilov
 */
public class RemoveDublicate {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {1,1,2};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        ArrayList<Integer> integers = new ArrayList<Integer>();
        int first = nums[0];
        int arrayLength = 0;
        integers.add(first);
        for (int i = 1; i < nums.length; i++) {
            if (nums[arrayLength] != nums[i]) {
                integers.add(nums[i]);
                arrayLength++;
                nums[arrayLength] = nums[i];
            }
        }
        return arrayLength+1;
    }
}
