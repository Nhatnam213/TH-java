package bai1;

import java.util.*;
public class cau3 {
    public static void main (String[]args){
        Scanner x = new Scanner(System.in);
        int array[];
        int n = 0;
        System.out.print("Nhap so luong phan tu cua mang: ");
        n = x.nextInt();
       
        //cap phat o nho  = so luong phan tu se dung
        array = new int[n];
         //nhap gia tri cho tung phan tu trong mang
     
        for (int i = 0; i< n ;i++){
            System.out.print( i + ":");
            array[i] = x.nextInt();
       
        }
        //timf phan tu lon nhat trong mang
        int max = array[0];
        for (int i = 0; i < n; i++)
        {
            if (max < (array[i]))
                max =array[i];
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max );
        x.close();
    }
}
