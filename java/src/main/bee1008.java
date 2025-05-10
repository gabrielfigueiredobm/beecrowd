package main;

import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFunc = sc.nextInt();
        int numHoras = sc.nextInt();
        double precoHora = sc.nextDouble();

        double salario = numHoras * precoHora;

        System.out.println("NUMBER = "+numFunc);
        System.out.println("SALARY = U$ "+ String.format("%.2f", salario));
    }
}
