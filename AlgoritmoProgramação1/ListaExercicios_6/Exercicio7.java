//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler.nextInt();

        int resultado = Fatorial(numero);

        System.out.println("Fatorial de " + numero + " = " + resultado);

        ler.close();
    }

    public static int Fatorial(int numero) {

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}
