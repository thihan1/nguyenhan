package main;

import java.util.Scanner;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("nhap so 1 de chon hinh chu nhat");
        System.out.println("nhap so 2 de chon hinh tron");
        System.out.println("nhap so 3 de chon hinh tru");
        System.out.println("nhap so 4 de chon hinh vuong");
        System.out.println("moi nhap lua chon");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                HinhChuNhat hinhchunhat = new HinhChuNhat();
                hinhchunhat.xuatTen();
                hinhchunhat.nhapChieuDai();
                hinhchunhat.nhapChieuRong();
                hinhchunhat.tinhChuVi();
                hinhchunhat.tinhDienTich();
                hinhchunhat.inChuVi();
                hinhchunhat.inDienTich();
                break;
            case 2:
                HinhTron hinhtron = new HinhTron();
                hinhtron.xuatTen();
                hinhtron.nhapBanKinh();
                hinhtron.tinhChuVi();
                hinhtron.tinhDienTich();
                hinhtron.inChuVi();
                hinhtron.inDienTich();
                break;
            case 3:
                HinhTru hinhtru = new HinhTru();
                hinhtru.xuatTen();
                hinhtru.nhapChieuCao();
                hinhtru.tinhTheTich();
                hinhtru.inTheTich();
                break;
            case 4:
                HinhVuong hinhvuong = new HinhVuong();
                hinhvuong.xuatTen();
                hinhvuong.nhapChieuDai();
                hinhvuong.tinhChuVi();
                hinhvuong.tinhDienTich();
                hinhvuong.inChuVi();
                hinhvuong.inDienTich();
                break;
            default:
                System.out.println("nhap sai so lieu");

        }

    }

}
