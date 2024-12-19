package bai2;
public class main3 {
    public static void main(String[] args) {
        Coodinate p1 = new Coodinate(2, 5);
        System.out.print("Diem p1: ");
        p1.in();

        Coodinate p2 = new Coodinate(-3, 7);
        System.out.print("Diem p2: ");
        p2.in();

        Coodinate tong = Coodinate.tong(p1, p2);
        System.out.print("Tong hai diem: ");
        tong.in();

        Coodinate doiXung = p1.doiXungQuaTrucHoanh();
        System.out.print("Diem doi xung qua truc hoanh cua p1: ");
        doiXung.in();
    }
}



    
