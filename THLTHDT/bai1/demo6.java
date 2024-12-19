package bai1;
    
    public class demo6 {
        public static void main(String[] args) {
            // Tạo một đối tượng mang với kích thước 5
            cau6 mang = new cau6(5);

            // Nhập dữ liệu cho mảng
            mang.input();

            // Xuất dữ liệu của mảng ra màn hình
            mang.output();

            // Tính và in ra gtrị trung bình của các số lẻ trong mảng
            double averageOdd = mang.averageOfOddNumbers();
            System.out.println("gtri trung binh cua cac so le trong msng: " + averageOdd);

            // Tìm và in ra phần tử lớn nhất của mảng
            int max = mang.findMax();
            System.out.println("Phan tu lon nhat trong msng: " + max);

            // Sắp xếp mảng theo thứ tự tăng dần và in ra màn hình
            mang.sortAscending();
            System.out.println("Mang sau khi sap xep theo thu tu tang dan:");
            mang.output();
        }
    }
