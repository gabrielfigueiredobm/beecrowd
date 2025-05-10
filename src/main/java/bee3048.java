package main.java;

import java.util.*;

public class bee3048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamSeq = sc.nextInt();
        int cont = 0;
        int last = -1;
        for (int i = 0; i < tamSeq; i++) {
            int x = sc.nextInt();

            if(x != last) {
                last = x;
                cont++;
            }
        }
        System.out.println(cont);
    }
}
