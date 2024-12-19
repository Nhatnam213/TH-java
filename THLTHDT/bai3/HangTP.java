package bai3;  
import java.util.Scanner;
    
public class HangTP extends HangHoa {
     int nsx;
     int nhh;
  
     HangTP() {
     }
  
     HangTP( String maHang, String tenHang, float gia, int nsx, int nhh){
         super(maHang, tenHang, gia);
         this.nsx = nsx;
         this.nhh = nhh;
     }
  
     public void Input(){
         super.Input();
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap ngay san xuat: ");
         nsx = sc.nextInt();
         System.out.println("Nhap ngay het han: ");
         nhh = sc.nextInt();
     }
  
     public void Output(){
         System.out.println("\t HANG THUC PHAM");
         super.Output();
         System.out.println("NSX: "+nsx+" | HSD: "+nhh);
     }
 }