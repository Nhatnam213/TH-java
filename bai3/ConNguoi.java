package bai3;
import java.util.Scanner;
public class ConNguoi {
    public String hoTen;
    public long namSinh;
    public ConNguoi() {
        hoTen = null;
        namSinh = 0;
    }
    public ConNguoi(String ht, long ns){
        hoTen = ht;
        namSinh = ns>1900?ns:1900;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("nhap nam sinh: ");
        namSinh = sc.nextLong();
    }
    @Override
    public String toString() {
        return "Ho ten: "+hoTen+" | Nam Sinh: "+namSinh;
    }
}    
