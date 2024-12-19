package bai1;
import java.util.Scanner;
 
public class cau2 {
    public static void main (String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.print("Nhap ma sinh vien: ");
            String masv=x.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoten=x.nextLine();
            System.out.print("Nhap tuoi:");
            String tuoi = x.nextLine();
            System.out.print("nam sinh :");
            String nam = x.nextLine();
            System.out.print("nhap dtb: ");
            float dtb =  x.nextFloat();
            System.out.println("maso: "+masv +" hoten: "+hoten +" tuoi: "+ tuoi + " nam sinh: "+ nam + " dtb: "+dtb);
        }
    }
}
