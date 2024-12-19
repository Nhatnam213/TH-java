package bai1;

import java.util.*;
public class cau5 {
    private String maso;
    private String hoten;
    private float dtb;

    public void setMaSo(String ms) {
        maso = ms;	
    }

    //setHoTen()
    public void setHoTen(String ht) {
        hoten = ht;
    }
    //setDTB()
    public void setDTB(float d) {
        dtb = d;
    }

    //get láy giá trị 
    public String getMaSo() {
        return maso;
    }
    // getHoTen
    public String getHoTen() {
        return hoten;
    }

    //getDTB
    public float getDTB() {
        return dtb;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma so hoc sinh:");
        maso = x.nextLine();
        System.out.print("Nhap ho ten:");
        hoten = x.nextLine();
        System.out.print("Nhap dtb:");
        dtb = x.nextFloat();

    }
    public void output() {
            System.out.println("Ma so hoc sinh: " + maso);
    System.out.println("Ten hoc sinh: " + hoten);
    System.out.println("Diem trung binh: " + dtb);
    }



    public void rank() {
        //xep loại theo điểm trung bình
        if (dtb >= 8.0) {
                System.out.print("Xep loai: Giỏi\n");
        }
        else if (dtb>=6.5 ) {
                System.out.print("Xep loai: Khá\n");
        }
        else if (dtb >=5.0) {
                System.out.print("Xep loai: Trung bình\n");
        }
        else {
                System.out.print("Xep loai: yếu\n");
        }

				
    }
		
}
