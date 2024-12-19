package bai1;
import java.util.Scanner;
public abstract class NV {
    protected String manv;
    protected String tennv;
    protected String trinhdo;
    protected long luongcb;
    
    protected NV(){
        manv = null;
        tennv = null;
        trinhdo = "0/10";
        luongcb = 0;
    }
    protected NV(String manv, String tennv, String trinhdo, long luongcb){
        this.manv = manv;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
        this.luongcb = luongcb;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        manv = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        tennv = sc.nextLine();
        System.out.print("Nhap trinh do nhan vien: ");
        trinhdo = sc.nextLine();
        System.out.print("Nhap luong co ban nhan vien: ");
        luongcb = sc.nextLong();
    }
    public void xuat(){
        System.out.println("Ma nhan vien: "+manv);
        System.out.println("Ten nhan vien: "+tennv);
        System.out.println("Trinh do: " + trinhdo + " | Luong co ban: " + luongcb);
    }
    public abstract long tinhLuong();
}


