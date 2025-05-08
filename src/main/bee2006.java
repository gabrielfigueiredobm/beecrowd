package main;

import java.util.*;

public class bee2006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int realType = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] seqInt = parseInt(seq);
        System.out.println(contaChas(realType, seqInt));
    }

    private static int[] parseInt(String[] seq) {
        int[] returner = new int[seq.length];
        for(int i = 0; i < returner.length; i++) returner[i] = Integer.parseInt(seq[i]);
        return returner;
    }

    private static int contaChas(int realType, int[] seq) {
        int cont = 0;
        for(int x: seq)
            if (x == realType) cont++;

        return cont;
    }
}
