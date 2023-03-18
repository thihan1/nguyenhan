package slide74.java;

import java.util.Scanner;

public class Slide74Java {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n;
     do{
     System.out.print("Nhap so phan tu cua mang:");
     n=sc.nextInt();
     }
     while(n<=0);
     int arrA[] = new int[n];
       System.out.println("nhap cac phan tu vao mang:");
     for(int i=0;i<arrA.length;i++)
     {
         System.out.print("A["+i+"] =");
         arrA[i]=sc.nextInt();
     }
     System.out.println("mang da nhap:");
     for(int i=0;i<arrA.length;i++)
     {
         System.out.print(arrA[i]+"\t");
     }
     System.out.println("\n");
     int tong=0,sochan=0,t=0;
     for(int i=0;i<arrA.length;i++)
     {
         if(arrA[i]%2==0)
         {
             tong=tong+arrA[i];
             sochan++;
         }
     }
     int A[]=new int [sochan];
     for(int i=0;i<arrA.length;i++)
     { 
         if(arrA[i]%2==0)
         {
               A[t]=arrA[i];
               t++;
         }
     }
     System.out.print("tong cac so chan trong mang la:");
      for(int i=0;i<sochan-1;i++){
         
          System.out.print(A[i]+"+");
      }
      System.out.print( A[(t-1)]+ "=" +tong);


     
    }
}
