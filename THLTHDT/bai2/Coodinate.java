
package bai2;


import java.util.Scanner;
import java.util.*;

public class Coodinate {
    private int x;
    private int y;

    public Coodinate() {
        x = 0;
        y = 0;
    }

    public Coodinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coodinate tong(Coodinate a, Coodinate b) {
        int x = a.x + b.x;
        int y = a.y + b.y;
        return new Coodinate(x, y);
    }

    public Coodinate doiXungQuaTrucHoanh() {
        int yMoi = -y;
        return new Coodinate(x, yMoi);
    }

    public void in() {
        System.out.println("Toa do: (" + x + ", " + y + ")");
    }
}

