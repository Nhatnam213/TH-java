package bai3;
import bai1.*;
import java.util.Scanner;
public class NVQuanLy extends NhanVienCLCao {
    private double phuCap;
    public NVQuanLy(double phuCap, String trinhDo, String Nghanh, 
            String noiDaoTao, long lg, String nnv, String ht, 
            long ns, PhongBanKhoa pbk){
        super(trinhDo, Nghanh, noiDaoTao, lg, nnv, ht,
 ns, pbk);
        this.phuCap = phuCap;
    }
    public NVQuanLy(){}
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong phu cap: ");
        phuCap = sc.nextDouble();                
    }
    public String toString() {
        return super.toString()+"\n"+"Phu cap la: "+phuCap;
    }
}
