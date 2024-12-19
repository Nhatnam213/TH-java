package bai3;
import java.util.Scanner;
public class PhongBanKhoa {
    public String maPBK;
    public String tenPBK;
    public PhongBanKhoa(){
        maPBK = tenPBK = null;
    }
    public PhongBanKhoa(String ma,String ten){
        setMaPBK(ma);
        setTenPBK(ten);
    }
    public String getMaPBK(){
        return maPBK;
    }
    public String getTenPBK(){
        return tenPBK;
    }
    public void setMaPBK(String ma){
        maPBK = ma;
    }
    public void setTenPBK(String ten){
        tenPBK = ten;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap maPBK: ");
        maPBK = sc.nextLine();
        System.out.print("nhap ten PBK: ");
        tenPBK = sc.nextLine(); 
    }
    public String toString() {
        return "ma PBK: "+maPBK+" | ten PBK: "+tenPBK;
    }
}
