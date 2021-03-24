/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.math.until;
import com.fu.math.unti.main.main;

/**
 *
 * @author ThanhLiemPro
 */
public class MathUnil {

    public static void main(String[] args) throws IllegalAccessException {
        int n = 5 ;
        long expected=120;
        long actual =main.getFactorial(n);
        System.out.println("5 ! expexted" +expected+"; actual:"+actual);
        //
          n = 0 ;
         expected=1;
         actual =main.getFactorial(n);
        System.out.println("5 ! expexted" +expected+"; actual:"+actual);
        System.out.println("0 ! expexted" +expected+"; actual:"+actual);
        
    }
   
   
   
    
}
