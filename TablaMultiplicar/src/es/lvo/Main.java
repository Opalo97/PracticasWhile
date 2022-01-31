package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i = 0, producto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué tabla de multiplicar quiere repasar? La tabla del: ");
        n = entrada.nextInt();

        while (i <= 10) {
            producto = i * n;
            System.out.println( i + "x" + n + "=" + producto);
            i = i + 1;

        }
    }
}
