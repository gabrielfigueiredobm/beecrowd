package main;

import java.util.*;

public class bee2374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expected = sc.nextInt();
        sc.nextLine();
        int actual = sc.nextInt();
        int change = expected - actual;
        System.out.println(change);
    }
}
