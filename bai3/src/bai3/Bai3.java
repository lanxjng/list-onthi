/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 *
 * @author admin
 */
public class Bai3 {
    private int n;

    public Bai3(int n) {
        this.n = n;
    }
    
    public boolean KT(int n){
        for(int i=2; i<n/2; i++)
            if (n%i==0) return false;
                   return true;
    }
    public String SoNT(){
        String kq="";
        for(int i=2; i<n;i++)
            if(KT(i))
                kq+= i+" ";
            return kq;
    }

    

}
