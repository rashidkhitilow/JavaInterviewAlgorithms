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
public class TriangelWithStars {
     public static void main(String[] args) {
        int n = 3;
        int a = 1;
        for (int i = n; i > 0; i--) {
           if(n>0) a*=i;
           else if(n!=0) {
               a=0x0;
           } else {
               a*=1;
           }
        }
        System.out.println("a = "+ a); 
        /*
        1.
        **************
        **************
        **************
        **************
         */
//        for (int j = 0; j < 4; j++) {
//            for (int i = 0; i < 10; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
        2.
        *
        **
        ***
        ****
        *****
         */
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        /*
        3.
            *
           **
          ***
         ****
        *****
         */
        //i=1 6 bos 1 *
        //i=2 5 bos 2 *
        //i=3 4 bos 3 *
        //i=4 3 bos 4 *
        //i=5 2 bos 5 *
        //i=6 1 bos 6 *
        //i=7 0 bos 7 *
//        for (int i = 1; i < 8; i++) {
//            for (int j = 0;j < 7-i; j++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a < i; a++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        /*
        4.
        = = =  = = =
        = = =  = = =
        = = =  = = =
        = = =  = = =
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("=");
                if(i!=2 && i!=5){
                    System.out.print(" ");
                }else if(i==5){
                    System.out.print("");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    
        int i=0;
        while (i<10) {        
            i++;
            if(i==3) continue;
            System.out.println("i="+i);
//            if(i==3) continue;
//            System.out.println("i="+(i++));
        }
        

      

    5.
        int a=0;
        for (int i = 0; i <= 5; i++) {
            a=a+i;
        }
        System.out.println(a);
        
        System.out.println(5*(6)/2);
        
    6.
    int ededin_factoru = factor(5);
    System.out.println("ededin factoru : " + ededin_factoru);
    public  static int factor(Integer x){
        if(x>1) return x*factor(x-1);
        else return 1;
    }
        *
       ***
      *****
     *******
    7.
    int n =5;
    for (int i = 0; i < n; i++) {
         for (int j = 1; j < n-i; j++) {
             System.out.print(" ");
         }
         for (int j = 0 ; j < 2*i+1; j++) {
             System.out.print("*");
         }
         for (int j = 1; j < n-i; j++) {
             System.out.print(" ");
         }
         System.out.println("");
     }    
    8. for factor
        int n = -10;
        int a = 1;
        for (int i = n; i > 0; i--) {
           if(n>0) a*=i;
           else if(n!=0) {
               a=0x0;
           } else {
               a*=1;
           }
        }
        System.out.println("a = "+ a); 
        
         */

    }
}
