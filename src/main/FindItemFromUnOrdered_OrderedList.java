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
public class FindItemFromUnOrdered_OrderedList {
    public static void main(String[] args) {
        int[] arrBubble = {2, 1, 34, 45, 23, 99, 56, -1, 0};
        System.out.println(findItemUnorderedList(45, arrBubble));
    }

    public static int findItemUnorderedList(int item, int[] itemList) {
        for (int i = 0; i < itemList.length; i++) {
            if (item == itemList[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findItemFromOrderedList(int item, int[] itemList) {
//        int listSize = itemList.length - 1;
//        int lowerIndx = 0;
//        int upperIndx = listSize;
//        int midPt = 0;
//        while (lowerIndx <= upperIndx) {
//            continue;
//            midPt = (lowerIndx + upperIndx) / 2;
//            if (itemList[midPt] == item) return midPt;
//            if (item > itemList[midPt]) {
//                lowerIndx = midPt + 1;
//            } else {
//                upperIndx = midPt - 1;
//            }
//        }
//        if (lowerIndx > upperIndx) {
//            return -2;
//        }
        return 1;
    }
}
