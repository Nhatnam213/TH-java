import java.util.*;
public class Employee {
	
    private String maSo;
    private String hoTen;
    static  double luongCoBan;
    private double heSoLuong;
    private int soLuongNhanVien;

    // Constructors
    public Employee () {
    }
    // Constructor có tham số 
    public Employee (String maSo, String hoTen, double luongCoBan, double heSoLuong, int soLuongNhanVien) {
        maSo = maSo;
        hoTen = hoTen;
        luongCoBan = luongCoBan;
        heSoLuong = heSoLuong;
        soLuongNhanVien = soLuongNhanVien;
    }
    // Constructor sao chép 
    public Employee(Employee c) {
        maSo = c.maSo;
        hoTen =c.hoTen;
        luongCoBan = c.luongCoBan;
        heSoLuong = c.heSoLuong;
        soLuongNhanVien =c.soLuongNhanVien;
    
    }
    // Getter và Setter
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        // Sử dụng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        maSo = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhập số lượng nhân viên: ");
        soLuongNhanVien = scanner.nextInt();
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        System.out.println("Mã số: " + maSo);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Số lượng nhân viên: " + soLuongNhanVien);
    }

    // Phương thức tính lương
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public static void main(String[] args) {
        // Sử dụng lớp NhanVien
    	Employee  nhanVien = new Employee ();
        nhanVien.nhapThongTin();
        nhanVien.xuatThongTin();
        System.out.println("Tổng lương: " + nhanVien.tinhLuong());
    }
}
