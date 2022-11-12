/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author admin
 */
public class Bai1 {

    private float a,b,c;

    public Bai1(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String Tinh(){
        String kq ="";
        if((a*a<b*b+c*c) && (b*b<a*a+c*c) && (c*c<b*b+a*a))
            kq = "Đây là 3 cạnh của tam giac !!!";
        else
            kq = "Đây không phải 3 cạnh của tam giac !!!";
        return kq;
    }
}
