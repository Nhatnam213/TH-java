  
 package bai3;
  
  
 public class DSHH
 {
     HangHoa a[];
     private int n;
  
     public DSHH()
     {
         a = new HangHoa[100];
         n =0;
     }
  
     public void Them1MH(HangHoa h)
     {
         h = a[n];
         n++;
     }
  
     public void XuatDSTheoLoai(byte loai)
     {
         if(loai == 1)
         {
             for(int i=0;i<n;i++)
             {
                 if(a[i] instanceof HangDM)
                 {
 a[i].Output();
 System.out.println();
                 }
             }
         }
 else if(loai==2)
         {
             for(int i=0;i<n;i++)
             {
                 if(a[i] instanceof HangTP)
                 {
 a[i].Output();
 System.out.println();
                 }
             
         
     
 }
}
}
}