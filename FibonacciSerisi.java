/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unver
 */
public class FibonacciSerisi {
    public static void main(String []args){
        int s1=0,s2=1,s3;
        
        for (int i = 0; i < 10; i++) {
            s3=s1+s2;
            System.out.print(s3+" ");
            s1=s2;
            s2=s3;
           
        }
    }
} 
