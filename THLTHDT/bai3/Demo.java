 
 package bai3;
  
 import java.util.Scanner;
  
 public class Demo {
     
public static void main(String[] args) {
    byte chon, loai;
    HangHoa h;
//        DSHH ds = new DSHH();
 //bai3
        DanhSachList ds= new DanhSachList();
        Scanner sc = new Scanner(System.in);
 do {
System.out.println("1: Them mot mat hang vao danh sach: ");
System.out.println("2: Xuat mat hang theo loai:  ");
System.out.println("3. Thoat");
System.out.println("Moi chon chuc nang: ");
chon = sc.nextByte();
switch(chon) {
                      
                    case 1:
                                                
                    System.out.println("1: Hang Dien May");
                    System.out.println("2: Hang Thuc Pham");
                    loai = sc.nextByte();    
                         
                        
 if(loai == 1)
                        h = new HangDM();
else 
                        h = new HangTP();                          

                             


  h.Input();
  ds.Them1MH(h);
  break;
  case 2:
  System.out.println("1: Xuat danh sach mat hang Dien May: ");
  System.out.println("2: Xuat danh sach mat hang Thuc Pham: ");
  loai = sc.nextByte();
  ds.XuatDSTheoLoai(loai);
  break;
  default: chon = 0;
                          
                        break;
  }
  }while(chon != 0);
      
}
  }