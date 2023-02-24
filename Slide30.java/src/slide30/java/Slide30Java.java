
package slide30.java;

import java.util.Scanner;


public class Slide30Java {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int tong=0;
        System.out.println(" nhap so nguyen n:");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        while(n>0){
            tong=tong+n%10;
            n=n/10;
        }
        System.out.println("tong cac chu so n la:"+ tong);
    }
    
    
}
