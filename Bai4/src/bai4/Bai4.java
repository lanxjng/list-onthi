/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

/**
 *
 * @author admin
 */
public class Bai4 {

    private int n;

    public Bai4(int n) {
        this.n = n;
    }
    
//    public int findFibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return findFibonacci(n - 2) + findFibonacci(n - 1);
//    }
//    public String Fibo(){
//        String kq="";
//        for(int i=0;i<n;i++){
//            kq += findFibonacci(i) +" ";
//        }return kq;
//    }

    public int Fibo(){
        if(n==0||n==1){
		         return 1;
	}
	else{
		int before=1;
		int after=1;
		int fi=0;
		for(int i=2;i<=n;i++){
			fi=before+after;
			before=after;
			after = fi;
		}
		         return fi;
	}
  
    
}
    }
    
   

