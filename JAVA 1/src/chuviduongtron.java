import java.util.*;
public class chuviduongtron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  r;
		Scanner x = new Scanner(System.in);
        System.out.print("Nhập bán kính của đường tròn: " );
        r = x.nextDouble();
        double  cv = (double)(2* Math.PI *r);
        double  dt = (double)( Math.PI *r*r);
        System.out.println("Chu vi của đường tròn: " + cv);
        System.out.print("Dien tich của đường tròn: " + dt);
        x.close();
        
        
    }
}