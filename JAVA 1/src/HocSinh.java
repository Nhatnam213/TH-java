import java.util.*;
public class HocSinh {
	private String maso,hoten;
	private float dtb;
	// Cac phuong thuc
	public void input() {
			Scanner x = new Scanner(System.in);
			System.out.print("Nhap ma so hs: ");
			maso = x.nextLine();
			System.out.print("Nhap ho ten hs: ");
			hoten = x.nextLine();
			System.out.print("Nhap dtb hs: ");
			dtb = x.nextFloat();
	}
	public void output() {
		System.out.print("Ma so: " +  maso  + " Ho ten: " +  hoten  + "  Diem Tb: " + dtb );
	}
	// set: Dat gia tri mới cho mã số
	public void setMaSo(String ms) {
		maso = ms;
	}
	// set: Dat gia tri mới cho họ tên
	public void setHoTen(String ten) {
		hoten = ten;
	}
	// set: Dat gia tri mới dtb
	public void setDiemTb(Float diemtb) {
		dtb = diemtb;
	}
	// get: lay gia tri cho maso
	public String  getMaSo( ) {
		return maso;
	}
	// get: lay gia tri cho ten
	public String  getHoTen( ) {
		return hoten;
	}
	// get: lay gia tri cho dtb
	public Float getDiemTb( Float diemtb) {
		return diemtb;
	}
	//pt xep loai
	public String rank() {
	    if (dtb >= 8.5) {
	        return "Giỏi ";
	    } else if (dtb >= 8.0) {
	        return "Khá Giỏi";
	    } else if (dtb >= 7.0) {
	        return "Khá";
	    } else if (dtb >= 6.5) {
	        return "Trung bình Khá ";
	    }else if (dtb >= 5.5) {
	        return "Trung bình  ";
	    }else if (dtb >= 5.0) {
	        return "Trung bình Yếu ";
	    }else if (dtb >= 4.0) {
	        return "Yếu ";
	    } else {
	        return "Kém";
	    }
	}
}