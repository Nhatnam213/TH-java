  
 package bai3;
  
 import java.util.ArrayList;
 import java.lang.reflect.Array;
  
 public class DanhSachList {
 ArrayList<HangHoa> ds;
  
 public DanhSachList() {
 ds = new ArrayList<>();
 }
 
 public void Them1MH(HangHoa h) {
 ds.add(h);
 }
 
 public void XuatDSTheoLoai(byte loai) {
             if(loai == 1) {
 for (HangHoa hangHoa : ds) {
                     if(hangHoa instanceof HangDM)
 hangHoa.Output();
 System.out.println();
 }
 }
             if(loai == 2) {
                 for (HangHoa hangHoa : ds) {
                     if(hangHoa instanceof HangTP)
 hangHoa.Output();
 System.out.println();
 }
 }
 }
 }