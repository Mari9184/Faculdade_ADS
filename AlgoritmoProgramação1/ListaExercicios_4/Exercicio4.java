//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double contador = 10;
        
        while (contador <= 20) {
            System.out.printf("A metade de %.0f é %.1f \n", contador, (contador / 2));
            contador++;
        }
    }
}
