/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huan.util;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MyToys {

    public static double PI = 3.14;
    private static Scanner sc = new Scanner(System.in);
   
    public static int getAnInteger() {

        int n;

        do {
            try {
                System.out.print("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know to input an integer?");
            }
        } while (true);
    }

    public static int getAnInteger(String inputMsg) {

        int n;
        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know to input an integer?");
            }
        } while (true);
    }
    public static int getAnInteger(String inputMsg, String errorMsg){
        int n;
        do {            
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        } while (true);
    }
    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
        int n, tmp;
        if(lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        do {            
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if(n <lowerBound || n > upperBound)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        } while (true);
    }
}
