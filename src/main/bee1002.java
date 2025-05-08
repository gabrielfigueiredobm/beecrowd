package main;

import java.util.*;

public class bee1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * (raio * raio);
        System.out.println("A="+String.format("%.4f", area));
    }
}
