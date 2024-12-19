package bai3;
import bai1.*;
import bai3.GiaoVien;

public class DSConNguoi1 {
    private ConNguoi ds[];
    private int sl;
    public  DSConNguoi1() {
        ds = new ConNguoi[1000];
        sl = 0;
    }
    public void themDS(ConNguoi cn){
        ds[sl] = cn;
        sl ++;
    }
    /*public void nhapDS(ConNguoi cn) {
        if(cn instanceof HocVien) {
            ds[sl] = new HocVien();
            ds[sl].nhap();
        } else if (cn instanceof NhanVien) {
            ds[sl] = new NhanVien();
            ds[sl].nhap();
        
        } else if (cn instanceof GiaoVien) {
            ds[sl] = new GiaoVien();
            ds[sl].nhap();
        }
        sl++;
    }*/
    public void xuatDS(int loai) {
        if(loai == 1){
            System.out.println("Danh sach hoc vien: ");
            for(int i = 0; i<sl; i++) {
                if(ds[i] instanceof HocVien) {
                    
                    System.out.println(ds[i]);
                }
            }
        } 
        else if(loai == 2){
            System.out.print("Danh sach nhan vien: ");
            for(int i = 0; i<sl; i++) {
                if(ds[i] instanceof NhanVien) {
                    System.out.println(ds[i]);
                }
            }
        } 
        else if (loai ==3){
            System.out.println("Danh sach Giao Vien:");
            for(int i = 0; i<sl; i++) {
                if (ds[i] instanceof GiaoVien) {
                    System.out.println(ds[i]);
                }
            }
        } 
    }
}
