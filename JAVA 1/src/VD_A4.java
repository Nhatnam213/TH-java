//BT1:Tính tổng dãy số tư 1...n
import java.util.*;
public class VD_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap so nguyen n:");
		n = x.nextInt();
		int tong = 0;
		for (int i =1;i <=n;i++) {
				tong +=i;
		}
		   System.out.println("Tổng của dãy số từ 1 đến " + n + " là: " + tong);
				
						
			
		
				
		
		
		
		x.close();
	}

}
