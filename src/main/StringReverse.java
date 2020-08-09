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
public class StringReverse {

    String reverse = "";

    public String reverseString2(String str) {

        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1) + reverseString2(str.substring(0, str.length() - 1));
            return reverse;
        }
    }

    
    public static String reverseString(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }
    public static String reverseStringWithStringBuilder(String s){
        StringBuilder sb =new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String a[]) {
        StringReverse srr = new StringReverse();
        System.out.println("Result: " + srr.reverseString2("Java2novice"));
        System.out.println(reverseString("Sanura Khitilova"));
        System.out.println(reverseStringWithStringBuilder("Rashid Khitilov"));
        System.out.println(reverseStringWithStringBuilder("Ramila Khalilova"));
        System.out.println(reverseStringWithStringBuilder("Shakir Khitilov"));
        System.out.println(reverseStringWithStringBuilder("Ulvi Khitilov"));
        System.out.println(reverseStringWithStringBuilder("Coshgun Khitilov"));
    }
}
