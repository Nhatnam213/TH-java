package bai3;
import java.util.Scanner;
public class HocVien extends ConNguoi {
    private int diem1;
    private int diem2;
    private int diem3;
    public HocVien() {
        super();
        diem1 = diem2 = diem3 = 0;
    }
    public HocVien(String ht,long ns ,int d1, int d2, int d3) {
        super(ht, ns);
        diem1 = d1>0?d1:0;
        diem2 = d2>0?d2:0;
        diem3 = d3>0?d3:0;
    }
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem1: ");
        diem1 = sc.nextInt();
        System.out.println("nhap diem2: ");
        diem2 = sc.nextInt();
        System.out.println("nhap diem3: ");
        diem3 = sc.nextInt();
    }
    public String toString() {
        return super.toString()+"\n"+"Diem cua hoc vien: diem 1: "+diem1+"; diem 2: "+diem2+"; diem 3 : "+diem3;
    }
}
