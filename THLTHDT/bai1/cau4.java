package bai1;

import java.util.*; 
public class cau4 {
    public static void main (String[] agrs){
        int m=2;
        int n=4;
        int[][] matrix = new int[m][n];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(51); // Sinh ngẫu nhiên từ 0 đến 50
                sum += matrix[i][j];
            }
        }
         // In ma trận ra màn hình
        System.out.println("Ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // In tổng giá trị các phần tử của ma trận
        System.out.println("Tong phan tu cac gia tri cua ma tran: " + sum);
    }
}
