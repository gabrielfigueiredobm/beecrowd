package main;

import java.util.*;

public class bee1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, dif;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        dif = (n1 * n2) - (n3 * n4);
        System.out.println("DIFERENCA = "+dif);
    }
}
