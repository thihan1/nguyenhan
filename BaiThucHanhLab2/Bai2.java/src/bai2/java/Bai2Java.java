package bai2.java;

import java.util.Scanner;

public class Bai2Java {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("nhap so nguyen :");
        int a=sc.nextInt();  
        if(a%2==0)
           System.out.println(a+" la so chan ");
        else
            System.out.println(a+" la so le");    }
    
}
