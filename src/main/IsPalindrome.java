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
public class IsPalindrome {
    public static void main(String[] args) {
        int x=12321;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int k=x;
        if(x<0) return false;
        long reversed = 0;
        while(x!=0){
            reversed=(reversed*10) +(x%10);
            x=x/10;
        }
        if((int)reversed==k) return true;
            else return false;
    }
    public static boolean isPalindromeFormula(int x) {
        int k=x;
        if(x<0) return false;
        long reversed = 0;
        while(x!=0){
            reversed=(reversed*10) +(x%10);
            x=x/10;
        }
        if((int)reversed==k) return true;
            else return false;
    }
}
