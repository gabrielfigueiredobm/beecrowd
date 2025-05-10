package main.java;

import java.util.*;

public class bee1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = ((n1*3.5)+(n2*7.5)) / (3.5+7.5);
        System.out.println("MEDIA = "+String.format("%.5f", media));
    }
}
