//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            // Exercício 11

        System.out.print("Informe sua idade");
        double idade = ler.nextDouble();

        if (idade >= 5 & idade <= 7) {
            System.out.print("infantil-A");
        }
            else if (idade >= 8 & idade <= 10) {
                System.out.print("infantil-B");
        }
        else if (idade >= 11 & idade <= 13) {
            System.out.print("Juvenil-A");
        }
        else if (idade >= 14 & idade <= 17) {
            System.out.print("Juvenil-B");
        }
        else if (idade >= 18) {
            System.out.print("Sênior");
        }
        else {
            System.out.print("Não tem idade para nadar");
        }
    }
}
