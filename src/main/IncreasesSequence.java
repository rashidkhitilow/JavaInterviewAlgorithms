/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author rashid.khitilov
 */
public class IncreasesSequence {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Array in uzunlugu nece olacaq?");
        Scanner sc =new Scanner(System.in);
        int arrayLength=sc.nextInt();
        int arr1[]= new int[arrayLength];
        
        for (int i = 0; i < arr1.length; i++) {
                System.out.println("arr-in "+(i+1)+"-ci ededini daxil edin: ");
                int arr2elements=sc.nextInt();
                arr1[i]=arr2elements;
        }
        
        boolean result=checkIfValuesIncreasesSequence(arr1);
        System.out.println(result);
    }
    
    public static boolean checkIfValuesIncreasesSequence(int[] arr1){
       int arr2[]= new int[arr1.length-1] ;
       for (int i = 1; i < arr1.length; i++) { 
            arr2[i-1]=arr1[i]-arr1[i-1];
       }
       boolean found = false;
       for (int i = 0; i < arr2.length; i++) { 
           for (int j = i + 1; j < arr2.length; j++) {
               if (arr2[i]==arr2[j]) { 
                found=true;
               } else{
                   found=false;
                   break;
               }
           } 
       }
       return found;
    }
}
