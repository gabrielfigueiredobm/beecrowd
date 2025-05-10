package main.java;

import java.util.*;

public class bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        media = ((n1*2) + (n2*3) + (n3*5)) / (2+3+5);
        System.out.println("MEDIA = "+String.format("%.1f", media));
    }
}
