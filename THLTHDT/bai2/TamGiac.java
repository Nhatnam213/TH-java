package bai2;

class TamGiac {
    private int a, b, c;
    TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int tinhChuVi() {
        return a + b + c;
    }
    public double tinhDienTich() {
        float p = (a + b + c) / 2;
        return Math.ceil(Math.sqrt(p*(p-a)*(p-b)*(p-c))*100)/100;
    }
    public boolean tgVuong() {
        return !(a*a + b*b != c*c && b*b + c*c != a*a && c*c + a*a != b*b);
    }
    public String loai() {
        if(a==b && b==c && c==a) return "tam giac deu";
        if(a==b || b==c || c==a) {
            if(tgVuong()) return "tam giac vuong can";
            return "tam giac can";
        }
        if(tgVuong()) return "tam giac vuong";
        return "tam giac thuong";
    }
    public void in() {
        System.out.println("Do dai cac canh: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Chu vi tam giac: " + tinhChuVi());
        System.out.println("Dien tich tam giac: " + tinhDienTich());
        System.out.println("Loai tam giac: " + loai());
    }
}