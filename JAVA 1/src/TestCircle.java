
public class TestCircle {

	public static void main(String[] args) {
		Cricle myCircle = new Cricle();
		System.out.printf("Duong tron voi ban kinh: %.2f,co dien tich: %2f" + "va chu vi: %.2f/n",myCircle.radius,myCircle.findArea(),myCircle.findPerimeter());
		myCircle.radius = 5 ;
		System.out.printf("Duong tron voi ban kinh: %.2f,co dien tich: %2f" + "va chu vi: %.2f/n",myCircle.radius,myCircle.findArea(),myCircle.findPerimeter());

	}

}
