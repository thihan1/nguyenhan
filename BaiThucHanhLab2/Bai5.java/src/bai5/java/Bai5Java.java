package bai5.java;

import java.util.Scanner;

public class Bai5Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(sum<100){
        System.out.println("nhap so nguyen:");
        int a=sc.nextInt();
        sum=sum+a;
    }
        System.out.println("'tong cua cac so la:"+sum);
    }
    
        
              
    
     
}
