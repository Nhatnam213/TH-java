package bai2;

class PTBacNhat {
    private int a, b;
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public PTBacNhat() {
        a = b = 0;
    }
    public PTBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String giai_PT() {
        if(a==0 && b==0) return "Phuong trinh vo so nghiem";
        if(a==0 && b!=0) return "Phuong trinh vo nghiem";
        String s = String.format("Phuong trinh co nghiem: x = %.2f", (double) -b/a);
        return s;
    }
    public String toString() {
        return "Phuong trinh: " + a + "x + " + b + " = 0\n" + giai_PT();
    }
}

