
package bai1;
import java.util.Scanner;
public class NVNC extends NV{
    private String chuyenmon;
    private long phucapdh;

    public NVNC(){
        super();
        chuyenmon = null;
        phucapdh = 0;
    }
    public NVNC(String manv, String tennv, String trinhdo, long luongcb,String chuyenmon, long phucapdh){
        super(manv, tennv, trinhdo, luongcb);
        this.chuyenmon = chuyenmon;
        this.phucapdh = phucapdh;
    }
    @Override
    public long tinhLuong() {
        return luongcb + phucapdh;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = sc.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        phucapdh = sc.nextLong();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: "+ chuyenmon);
        System.out.println("Phu cap doc hai: " + phucapdh + " | luong: " + tinhLuong());
    }
}

