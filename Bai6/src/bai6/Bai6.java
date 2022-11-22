/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author admin
 */
public class Bai6 {

    public int UCLN(int a,int b){
       int min =a;
        if(min >b){
            min = b;
        }
       for(int i=min; i>=1; i--){
           if(a%i == 0 && b%i ==0){
               return i;
           }
           
       }
        return 1;
    }
    public int BCNN (int a, int b){
        int max =a;
        if(max <b){
            max = b;
        }
        for(int i = max; i<= a*b; i++){
            if(i% a==0 && i%b ==0){
                return i;
            }
        }
        return a*b;
    }
    
}
