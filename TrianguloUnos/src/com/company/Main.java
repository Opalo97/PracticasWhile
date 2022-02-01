package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i = 1, producto = 1,p = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indica la altura, en filas, del triángulo: ");
        n = entrada.nextInt();

        while (i <= n) {
            System.out.println(producto);
            producto = p * 10 + 1;
            p = producto;
            i++;

        }

    }
}
