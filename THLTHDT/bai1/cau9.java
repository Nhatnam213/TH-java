package bai1;
 import java.util.*;
public class cau9 {

    public static void main(String[] args) {
        
        int a[][];
        int m, n;
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        m = x.nextInt();
        System.out.print("Nhap so cot: ");
        n = x.nextInt();
        a = new int[m][];
        for (int i=0; i<m; i++) a[i] = new int[n];
                
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("Nhap phan tu dong " + (i+1) + " cot " + (j+1) + ": ");
                a[i][j] = x.nextInt();
            }
        }
        int k;
        long sum = 0;
        System.out.print("Nhap k: ");
        k = x.nextInt();
        for(int j=0; j<n; j++)
            sum += a[k-1][j];
        System.out.println("Tong hang thu " + k + " cua ma tran: " + sum);
    }
    
}