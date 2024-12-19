import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Tạo 3 đối tượng nhân viên bằng 3 cách khác nhau
    	Employee nv1 = new Employee();
        nv1.setMaSo("NV001");
        nv1.setHoTen("Nguyen Van A");
        nv1.setLuongCoBan(1000000);
        nv1.setHeSoLuong(2.5);
        nv1.setSoLuongNhanVien(5);
        
        Employee nv2 = new Employee("NV002", "Tran Thi B", 1200000, 2.2, 8);
        //Nhap dữ liệu cho 1 nv từ bàn phím,xuất ra
        Employee nv3 = new Employee();
        nv3.nhapThongTin();
     
        

        // In ra thông tin của nhân viên có hệ số lương cao nhất trong 3 nhân viên
        System.out.println("\nThông tin của nhân viên có hệ số lương cao nhất trong 3 nhân viên:");
        Employee nvCoHeSoLuongCaoNhat = timNhanVienCoHeSoLuongCaoNhat(nv1, nv2, nv3);
        nvCoHeSoLuongCaoNhat.xuatThongTin();

        // Nhập danh sách nhân viên và xuất ra màn hình cùng với lương của mỗi nhân viên
        System.out.println("\nNhập danh sách nhân viên:");
        Employee[] danhSachNhanVien = nhapDanhSachNhanVien();
        System.out.println("\nDanh sách nhân viên và lương:");
        xuatDanhSachNhanVienVaLuong(danhSachNhanVien);

        // In số lượng nhân viên trong danh sách
        System.out.println("\nSố lượng nhân viên trong danh sách: " + danhSachNhanVien.length);
    }

    // Phương thức tìm nhân viên có hệ số lương cao nhất trong 3 nhân viên
    private static Employee timNhanVienCoHeSoLuongCaoNhat(Employee nv1, Employee nv2, Employee nv3) {
    	Employee nvCoHeSoLuongCaoNhat = nv1;
        if (nv2.getHeSoLuong() > nvCoHeSoLuongCaoNhat.getHeSoLuong()) {
            nvCoHeSoLuongCaoNhat = nv2;
        }
        if (nv3.getHeSoLuong() > nvCoHeSoLuongCaoNhat.getHeSoLuong()) {
            nvCoHeSoLuongCaoNhat = nv3;
        }
        return nvCoHeSoLuongCaoNhat;
    }

    // Phương thức nhập danh sách nhân viên từ bàn phím
    private static Employee[] nhapDanhSachNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int soLuong = scanner.nextInt();
        Employee[] danhSachNhanVien = new Employee[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            Employee nv = new Employee();
            nv.nhapThongTin();
            danhSachNhanVien[i] = nv;
        }
        return danhSachNhanVien;
    }

    // Phương thức xuất danh sách nhân viên và lương của mỗi nhân viên
    private static void xuatDanhSachNhanVienVaLuong(Employee[] danhSachNhanVien) {
        for (Employee nv : danhSachNhanVien) {
        	
            nv.xuatThongTin();
            System.out.println("Lương: " + nv.tinhLuong());
            System.out.println(); // Xuống dòng để phân biệt thông tin của các nhân viên
        }
    }
}
