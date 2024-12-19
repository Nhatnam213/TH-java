package bai1;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
        cau5 hs = new cau5();
        hs.input();
        hs.output();
        hs.rank();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten moi: ");
        String hoten = sc.nextLine();
        hs.setHoTen(hoten);


        cau5 hs2 = new cau5();
        hs2.input();
        if (hs.getDTB() > hs2.getDTB()) {
            System.out.println(hs.getHoTen() + " co diem tung binh cao hon " + hs2.getHoTen());
        } 
        else if (hs.getDTB() < hs2.getDTB())
        {
            System.out.println(hs2.getHoTen() + "co diem trung binh cao hon " + hs.getHoTen());
        }
        else {
            System.out.println(hs2.getHoTen() + " co diem trung binh bang nhau " + hs.getHoTen());

        }
    }
}
