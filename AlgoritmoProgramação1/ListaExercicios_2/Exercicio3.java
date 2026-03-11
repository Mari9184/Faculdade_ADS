//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        

            // Exercício 3

        System.out.println("Informe um numero");
        double a = ler.nextDouble();

        System.out.println("Informe um numero");
        double y = ler.nextDouble();

        double M = a - y;

        if (a == y) {
            System.out.println("Estes números são iguais, não ah diferença.");
        } else {
            System.out.println("A diferença entre esses numero é de:" + M);
        }
    }
}
