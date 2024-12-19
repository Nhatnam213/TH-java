
package bai1;
import java.util.Scanner;
import bai1.*;
public class Main {
    public static void main(String[] args) {
        byte loai;
        Scanner doc=new Scanner(System.in);
        DSHocVien ds = new DSHocVien();
        ds.DSHV();
        NV nv; 
        do{ 
            System.out.println("1.Nhap 1 Nhan vien quan ly");
            System.out.println("2.Nhap 1 nhan vien NC");
            System.out.println("3.Nhap 1 nhan vien PV");
            System.out.println("4.Xuat thong tin danh sach nhan vien quan ly");
            System.out.println("5.Xuat thong tin danh sach nhan vien NC");
            System.out.println("6.Xuat thong tin danh sach nhan vien PV");
            System.out.println("7.Tong luong cua tat ca nhan vien");
            System.out.println("8.Thoat");
            loai = doc.nextByte();
            switch(loai) {
                case 1:
                    nv = new NVQL ();
                    ds.nhapDS(nv);
                    break;
                case 2:
                    nv = new NVNC();
                    ds.nhapDS(nv);
                    break;
                case 3:
                    nv = new NVPV();
                    ds.nhapDS(nv);
                    break;
                case 4:
                case 5:
                case 6:
                    ds.xuatDS(loai);
                    break;
                case 7:
                    System.out.println("Tong luong la: "+ds.tongluongnv());
                    break;
            }
        } while(loai!=7);
    }
}