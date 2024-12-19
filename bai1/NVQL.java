
package bai1;
import java.util.Scanner;

public class NVQL extends NV{
    private String chuyenmon;
    private long phucapcv;

    public NVQL(){
        super();
        chuyenmon = null;
        phucapcv = 0;
    }
    public NVQL(String manv, String tennv, String trinhdo, long luongcb,String chuyenmon, long phucapcv){
        super(manv, tennv, trinhdo, luongcb);
        this.chuyenmon = chuyenmon;
        this.phucapcv = phucapcv;
    }
    @Override
    public long tinhLuong() {
        return luongcb + phucapcv;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = sc.nextLine();
        System.out.print("Nhap phu cap chuc vu: ");
        phucapcv = sc.nextLong();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: "+ chuyenmon);
        System.out.println("Phu cap chuc vu: " + phucapcv + " | luong: " + tinhLuong());
    }
}