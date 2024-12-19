package bai3;
import bai1.*;
import java.util.Scanner;
public class NhanVienCLCao extends NhanVien {
    private String trinhDo, Nghanh, noiDaoTao;
    public NhanVienCLCao(){}
    public NhanVienCLCao(String trinhDo, String Nghanh, 
            String noiDaoTao, long lg, String nnv, String ht, 
            long ns, PhongBanKhoa pbk) {
        super();
        this.trinhDo = trinhDo;
        this.Nghanh = Nghanh;
        this.noiDaoTao = noiDaoTao;
    }
    public void nhap(){
        Scanner x = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap trinh do: ");
        trinhDo = x.nextLine();
        System.out.println("Nhap nganh: ");
        Nghanh = x.nextLine();
        System.out.println("Nhap noi dao tao: ");
        noiDaoTao = x.nextLine();
    }
    
    public String toString() {
        return "\n"+"Ho ten: "+hoTen+" | Nam sinh: "+namSinh+
                "| Luong: "+ luong+ " | Ngay nv: " +ngayNV+
                "\n"+"Trinh do: "+trinhDo+" | Nganh: "+Nghanh+" | Noi dao tao: "+noiDaoTao;
    }
}
