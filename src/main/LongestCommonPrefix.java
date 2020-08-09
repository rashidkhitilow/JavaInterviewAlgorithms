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
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr= {"fl","fl","fll"};
        System.out.println(longestCommonPrefix(arr));
    }
     public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String lpref="";
        for(int i=0;i<strs[0].length();i++){
           char fs=strs[0].charAt(i); 
           Character cpref=null;
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()>lpref.length() && fs==strs[j].charAt(i)){
                    cpref=strs[j].charAt(i);
                }else{
                    return lpref;
                }
            }
            lpref+=cpref;
        }
        return lpref;
    }
}
