package bai3;
import java.util.Scanner;
 
public class HangHoa {
     protected String maHang;
     protected String tenHang;
     protected float gia;
  
     HangHoa(){
     }
 
     public HangHoa(String maHang, String tenHang, float gia) {
         this.maHang = maHang;
         this.tenHang = tenHang;
         this.gia = gia;
     }
  
     public void Input(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap ma hang: ");
         maHang = sc.nextLine();
         System.out.println("Nhap ten hang: ");
         tenHang = sc.nextLine();
         System.out.println("Nhap gia: ");
         gia = sc.nextFloat();
     }
  
     public void Output(){
          System.out.println("Ma hang: "+maHang+" | Ten hang: "+tenHang+" | Gia: "+gia);
     }
}