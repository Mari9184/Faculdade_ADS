//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            //Exercicio 10

        System.out.print("Informe o 1° numero");
        double q = ler.nextDouble();

        System.out.print("Informe o 2° numero");
        double w = ler.nextDouble();

        System.out.print("Informe o 3° numero");
        double e = ler.nextDouble();

        if (q == w & w == e) {
            System.out.print("Todos os numero são iguais");
        }
        else if (q > w & q > e) {
            System.out.println("Este é o maior numero:" + q);
        }
        else if (w > q & w > e) {
                System.out.println("Este é o maior numero:" + w);
        }
        else {
            System.out.println("Este é o maior numero:" + e);
        }
    }
}
