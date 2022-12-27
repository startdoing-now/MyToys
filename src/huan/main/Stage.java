/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huan.main;

import huan.util.MyToys;

/**
 *
 * @author admin
 */
public class Stage {

    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
//        int n = MyToys.getAnInteger();
//        System.out.println("n = " + n);
//          int choice = MyToys.getAnInteger("input your choise:" );
//          System.out.println("Yout choise is: " + choice);
//          int n = MyToys.getAnInteger("Moi nhap vao mot so nguyen: ", "Khong biet nhap so nguyen a?");
//          System.out.println("So nguyen ban vua nhap la: " + n);
          int n = MyToys.getAnInteger("moi nhap lua chon tu 1 den 5 ", "Ban da nhap sai", 5, 1);
          System.out.println("Lua chon cua ban la " + n);
          
    }

}
