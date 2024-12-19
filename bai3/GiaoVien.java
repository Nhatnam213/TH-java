package bai3;
import bai1.*;
import java.util.Scanner;
public class GiaoVien extends NhanVienCLCao {
    private double thuLao;
    public GiaoVien(double thuLao, String trinhDo, String Nghanh, 
            String noiDaoTao, long lg, String nnv, String ht, 
            long ns, PhongBanKhoa pbk) {
        super(trinhDo, Nghanh, noiDaoTao, lg, nnv, ht,
 ns, pbk);
        this.thuLao = thuLao;
    }
    public GiaoVien(){}
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap thu lao: ");
        thuLao = sc.nextDouble();
    }
    public String toString() {
        return super.toString()+"\n"+"Thu lao la: "+thuLao;
    }
}

