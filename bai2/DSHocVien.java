
package bai2;
import bai1.*;
public class DSHocVien {
    NV  ds[];
    int sl;
    long tongluong;

    public void DSHV(){
        sl = 0;
        ds = new NV[100];
        tongluong = 0;
    }
    public void nhapDS(NV nv) {
        if(nv instanceof NVQL) {
            ds[sl] = new NVQL();
            ds[sl].nhap();
        } 
        else if (nv instanceof NVNC)  {
            ds[sl] = new NVNC();
            ds[sl].nhap();
        }
        else {
            ds[sl] = new NVPV();
            ds[sl].nhap();
        }
        sl++;
    }
    public void xuatDS(byte loai) {
        if(loai == 4) {
            System.out.println("Danh sach NVQL: ");
            for(int i = 0; i<sl; i++) {
                if(ds[i] instanceof NVQL) {
                    ds[i].xuat();
                }
            }
        } 
        else if (loai == 5) {
            System.out.print("Danh sach NVNC: ");
            for(int i = 0; i<sl; i++) {
                if(ds[i] instanceof NVNC) {
                    ds[i].xuat();
                }
            }
        }
        else {
            System.out.print("Danh sach NVPV: ");
            for(int i = 0; i<sl; i++) {
                if(ds[i] instanceof NVPV) {
                    ds[i].xuat();
                }
            }
        }
    }
        public long tongluongnv(){
        for(int i = 0; i<sl; i++) {
            if (ds[i] instanceof NVQL){
                tongluong += ds[i].tinhLuong();
            }
            if (ds[i] instanceof NVNC){
                tongluong += ds[i].tinhLuong();
            }
            if (ds[i] instanceof NVPV){
                tongluong += ds[i].tinhLuong();
            }
        }
        return tongluong;
    }
}

    