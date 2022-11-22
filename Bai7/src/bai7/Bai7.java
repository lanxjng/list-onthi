/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;

/**
 *
 * @author admin
 */
public class Bai7 {
    
    
    public String Result(int n) {
        int i=2;
        String kq ="";
        while(n!=1){
            while(n%i ==0){ 
                n = n/i;
                kq += i ;
                if(n!=1) 
                    kq +=" x ";
            }                              
            i++;
        }
        return kq;
    }
}
