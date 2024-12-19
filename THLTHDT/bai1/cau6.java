package bai1;


import java.util.Arrays;
import java.util.Scanner;

public class cau6 {
    private int[] array;
    private int size;

    // Constructor
    public cau6(int size) {
        this.size = size;
        array = new int[size];
    }

    // Phương thức set giá trị cho phần tử tại index
    public void set(int index, int value) {
        array[index] = value;
    }

    // Phương thức get giá trị của phần tử tại index
    public int get(int index) {
        return array[index];
    }

    // Phương thức nhập dữ liệu cho mảng từ bàn phím
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // Phương thức xuất dữ liệu của mảng ra màn hình
    public void output() {
        System.out.println("Cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Phương thức tính trị trung bình của các số lẻ trong mảng
    public double averageOfOddNumbers() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        if (count == 0) {
            return 0; // Tránh chia cho 0
        }
        return (double) sum / count;
    }

    // Phương thức tìm phần tử lớn nhất của mảng
    public int findMax() {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Phương thức sắp xếp mảng theo thứ tự tăng dần
    public void sortAscending() {
        Arrays.sort(array);
    }
}
