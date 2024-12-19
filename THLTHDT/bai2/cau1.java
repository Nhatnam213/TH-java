package bai2;

import java.util.*;

class HocSinh {
    String ten;
    double dtb;

    public HocSinh(String ten, double dtb) {
        this.ten = ten;
        this.dtb = dtb;
    }
}

class DShocSinh {
    ArrayList<HocSinh> ds;

    public DShocSinh() {
        ds = new ArrayList<HocSinh>();
    }

    public void NhapThongTin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hoc sinh: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap ten hoc sinh " + (i+1) + ": ");
            String ten = input.nextLine();
            System.out.print("Nhap diem trung binh cua hoc sinh " + (i+1) + ": ");
            double dtb = input.nextDouble();
            input.nextLine();

            ds.add(new HocSinh(ten, dtb));
        }
    }

    public void inThongTin() {
        for(HocSinh hs : ds) {
            System.out.println("Ten: " + hs.ten);
            System.out.println("Diem trung binh: " + hs.dtb);
        }
    }

    public void sapXep() {
        Collections.sort(ds, new Comparator<HocSinh>() {
            public int compare(HocSinh hs1, HocSinh hs2) {
                if(hs1.dtb > hs2.dtb) return 1;
                else if(hs1.dtb > hs2.dtb) return -1;
                else return 0;
            }
        });
    }
}

class Demo3 {

    public static void main(String[] args) {
        DShocSinh dshs = new DShocSinh();
        dshs.NhapThongTin();
        dshs.sapXep();
        dshs.inThongTin();
    }
}