package bai2;
import java.util.*;
public class demo4 {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("2024002", "Nguyen Van C", 1.8F);
        NhanVien nv3 = new NhanVien(nv2);
        System.out.println(">> Nhap thong tin nhan vien 1:");
        nv1.input();
        System.out.println(">> Thong tin nhan vien 1:");
        nv1.output();
        nv3.setMaSo("2024003");
        System.out.println(">> Ten hien tai cua nhan vien 3: " + nv3.getHoTen());
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Nhap ten moi cho nhan vien 3: ");
        nv3.setHoTen(sc.nextLine());
        System.out.println(">> Ten moi cua nhan vien 3: " + nv3.getHoTen());
        System.out.println(">> Nhan vien co he so luong cao nhat:");
        if (nv1.getHeSoLuong() >= nv2.getHeSoLuong() && nv1.getHeSoLuong() >= nv3.getHeSoLuong()) {
            nv1.output();
        } else if (nv2.getHeSoLuong() >= nv3.getHeSoLuong()) {
            nv2.output();
        } else {
            nv3.output();
        }
        DSNV ds = new DSNV();
        ds.inputDSNV();
        ds.outputDSNV();
        ds.inSL();
    }
    
}
