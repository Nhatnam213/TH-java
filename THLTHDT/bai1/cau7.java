package bai1;

public class cau7 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang cua chuong cua " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }
}

