package slide35.jva;

import java.util.Scanner;

public class Slide35Jva {

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhap so nguyen b:");
        int b = scanner.nextInt();
        int z = Math.min(a, b);
        System.out.println("so nho nhat la " + z);

    }
}
