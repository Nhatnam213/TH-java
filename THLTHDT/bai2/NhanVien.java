package bai2;

import java.util.*;

class NhanVien {
  static int soLuongNhanVien = 0;
  static long luongCoBan = 1800000;
  private String maSo, hoTen;
  private float heSoLuong;
  NhanVien() {
    maSo = hoTen = null;
    heSoLuong = 0;
    soLuongNhanVien++;
  }
  NhanVien(String ms, String ht) {
    maSo = ms;
    hoTen = ht;
    heSoLuong = 0;
    soLuongNhanVien++;
  }
  NhanVien(String ms, String ht, float hsl) {
    maSo = ms;
    hoTen = ht;
    heSoLuong = hsl;
    soLuongNhanVien++;
  }
  NhanVien(NhanVien nv) {
    maSo = nv.maSo;
    hoTen = nv.hoTen;
    heSoLuong = nv.heSoLuong;
    soLuongNhanVien++;
  }
  // set/get ma so
  public void setMaSo(String ms) {
    maSo = ms;
  }
  public String getMaSo() {
    return maSo;
  }
  // set/get ho ten
  public void setHoTen(String ht) {
    hoTen = ht;
  }
  public String getHoTen() {
    return hoTen;
  }
  // set/get he so luong
  public void setHeSoLuong(float hsl) {
    heSoLuong = hsl;
  }
  public float getHeSoLuong() {
    return heSoLuong;
  }
  // nhap du lieu nhan vien
  public void input() {
    @SuppressWarnings("resource")
    Scanner x = new Scanner(System.in);
    System.out.print("Nhap ma so nhan vien: ");
    maSo = x.nextLine();
    System.out.print("Nhap ho ten nhan vien: ");
    hoTen = x.nextLine();
    System.out.print("Nhap he so luong nhan vien: ");
    heSoLuong = x.nextFloat();
    x.nextLine();
  }
  // xuat thong tin nhan vien
  public void output() {
    System.out.println("> Thong tin nhan vien:");
    System.out.println("Ma so nhan vien: " + maSo);
    System.out.println("Ho ten nhan vien: " + hoTen);
    System.out.println("He so luong nhan vien: " + heSoLuong);
    System.out.println("Luong nhan vien: " + luong());
  }
  // tinh luong nhan vien
  public float luong() {
    return heSoLuong * luongCoBan;
  }
  // in so luong nhan vien
  public static void inSLNV() {
    System.out.println("So luong nhan vien: " + soLuongNhanVien);
  }
}

class DSNV {
  private int n;
  private NhanVien[] dsnv;
  public DSNV() {
    n = 3;
    dsnv = new NhanVien[n];
    for(int i=0; i<n; i++) dsnv[i] = new NhanVien();
  }
  public DSNV(int n) {
    this.n = n;
    dsnv = new NhanVien[n];
    for(int i=0; i<n; i++) dsnv[i] = new NhanVien();
  }
  public void inputDSNV() {
    System.out.println(">> Nhap danh sach nhan vien:");
    for(int i=0; i<n; i++) {
      System.out.println("> Nhap nhan vien thu " + (i+1) + ":");
      dsnv[i].input();
    }
  }
  public void outputDSNV() {
    System.out.println(">> In danh sach nhan vien:");
    for(int i=0; i<n; i++)
      dsnv[i].output();
  }
  public void inSL() {
    System.out.println(">> So luong nhan vien trong danh sach: " + n);
  }
}