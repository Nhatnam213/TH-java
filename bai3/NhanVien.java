package bai3;
import java.util.Scanner;
public class NhanVien extends ConNguoi{
    public long luong;
    public String ngayNV;
    PhongBanKhoa Pbk = new PhongBanKhoa();
    public NhanVien(){
        super();
        luong = 0;
        ngayNV = null;
    }
    public NhanVien(String ht, long ns,long lg, String nnv,PhongBanKhoa pbk){
        super(ht, ns);
        luong = lg;
        ngayNV = nnv;
        Pbk = pbk;
    }
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap luong: ");
        luong = sc.nextLong();
        System.out.print("nhap ngayNV: ");
        ngayNV = sc.next();
        Pbk.nhap();
    }
    public String toString() {
        return super.toString() +"\n" + "Luong: " + luong + "  | NgayNV: " + ngayNV + "\n"+ "MaPBK: " + Pbk.getMaPBK()+ " | TenPBK: "+Pbk.getTenPBK();
    }
}
