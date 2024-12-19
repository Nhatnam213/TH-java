package bai3;
import bai3.ConNguoi;
import bai3.HocVien;
import bai3.NhanVien;
import bai3.DSConNguoi1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int chon , loai;
        Scanner doc = new Scanner(System.in);
        DSConNguoi1 ds = new DSConNguoi1();
        do{
            System.out.println("1.Nhap 1 hoc vien");
            System.out.println("2.Nhap 1 nhan vien quan ly");
            System.out.println("3.Nhap 1 giao vien ");
            System.out.println("4.Xuat thong tin danh sach hoc vien");
            System.out.println("5.Xuat thong tin danh sach nhan vien quan ly");
            System.out.println("6.Xuat thong tin danh sach giao vien");
            System.out.println("0.Thoat");
            chon = doc.nextInt();
            switch(chon) {
                case 1:
                    HocVien hv = new HocVien();
                    hv.nhap();
                    ds.themDS(hv);
                    break;
                case 2:
                    NVQuanLy nv = new NVQuanLy();
                    nv.nhap();
                    ds.themDS(nv);
                    break;
                case 3:
                    GiaoVien gv = new GiaoVien();
                    gv.nhap();
                    ds.themDS(gv);
                    break;    
                case 4:
                    loai = 1;
                    ds.xuatDS(loai);
                    break;
                case 5:
                    loai = 2;
                    ds.xuatDS(loai);
                    break;
                case 6:    
                    loai = 3;
                    ds.xuatDS(loai);
                    break;
                default: chon = 0;
                    break;
            }
        } while(chon!=0);
    }
}

