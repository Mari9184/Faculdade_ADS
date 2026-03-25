//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1, numero;
        
        System.out.printf("Digite um numero: ");
        numero = ler.nextInt();

        while (contador <= numero) {
            System.out.println(contador);
            contador = contador * 2;
        }
    }
}
