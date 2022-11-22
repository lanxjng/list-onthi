/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

/**
 *
 * @author admin
 */
public class Bai5 {

    private int arr[];

    public Bai5(int n) {
        this.arr = new int[n];
    }
    public void nhap(String txt){
        String str[]=txt.split(","); // 1,2,3
        for(int i=0;i<arr.length;i++){
            arr[i]= Integer.parseInt(str[i]);
        }
    }
    public String Tinh(){
        int sum = 0;
        int max = arr[0];
        for(int a: arr){
            sum+=a;
            if(max<a){
                max=a;
            }
        }
        int avg = sum/arr.length;
        
        return "tbc: "+ String.valueOf(avg)+ " max: "+String.valueOf(max) ;
    }
    
    
    
    
    
}
