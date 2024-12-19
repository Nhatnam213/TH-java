//vi du3: Nhap cd,cr .Tinh chu vi cua hcn
import java.util.*;
public class VD_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cd,cr;
		// Tao 1 dooi tuong thuoc lop Scanner
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap cd,cr hcn:");
		cd = x.nextInt();
		cr = x.nextInt();
		int cv = (cd+cr)*2;
		int dt = cd * cr ;
		System.out.println("Chu vi hcn la: " + cv );
		System.out.print("dien tic hcn la: " + dt );
		x.close();
		
	}

}
