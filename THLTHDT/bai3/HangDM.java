package bai3;


import java.util.Scanner;

public class HangDM extends HangHoa{
    int tgbh;
    int dienap;
    int cs;

    HangDM(){
     }
     
      HangDM( String maHang, String tenHang, float gia, int tgbh, int dienap, int cs){
             super(maHang, tenHang, gia);
             this.tgbh = tgbh;
             this.cs = cs;
             this.dienap = dienap;
     } 
     public void Input(){
             super.Input();
             Scanner sc = new Scanner(System.in);
             System.out.println("Nhap thoi gian bao hanh: ");
             tgbh = sc.nextInt();
             System.out.println("Nhap dien ap: ");
             dienap = sc.nextInt();
             System.out.println("Nhap cong suat: ");
             cs = sc.nextInt();
         }  
     public void Output(){
             System.out.println("\t HANG DIEN MAY");
             super.Output();
             System.out.println("Thoi gian bao hanh: "+tgbh+" | Dien ap:"+dienap+" | Cong suat: "+cs);
         }

}
    

