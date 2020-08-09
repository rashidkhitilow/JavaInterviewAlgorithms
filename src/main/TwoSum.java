/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author rashid.khitilov
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 5, 6, 9, 1};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] getTwoSum(int[] numbers, int target) {
        int[] twoNumbers = {};
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (temp > 0 && IntStream.of(twoNumbers).anyMatch(x -> x == temp)) {
                Arrays.fill(twoNumbers, numbers[i]);
            }
            if (temp == numbers[i]) {
                Arrays.fill(twoNumbers, temp);
            }
        }
        return twoNumbers;
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int result = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(result==nums[j]){
                     return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
