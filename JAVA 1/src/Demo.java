import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocSinh hs1 = new HocSinh();
		// Nhập thông tin học sinh từ bàn phím
		hs1.input();
		// Xuất thông tin học sinh và xếp loại
        System.out.println("Thông tin học sinh:");
        hs1.output();
        System.out.println("\nXếp loại học sinh: " + hs1.rank());
        // Đổi tên học sinh từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập tên mới của học sinh: ");
        String tenMoi = scanner.nextLine();
        hs1.setHoTen(tenMoi);

        // Xuất thông tin học sinh sau khi đổi tên
        System.out.println("\nThông tin học sinh sau khi đổi tên:");
		
		hs1.output();
		
		


	}

}
