//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Desafio

        System.out.print("Você tem Titulo de eleitor?(S/N)");
        String P = ler.nextLine();

        System.out.print("Informe sua idade:");
        double I = ler.nextDouble();

        if (I >= 16 & P.equals("S")) {
            System.out.print("Você está Apto para votar.");
        }
        else{
            System.out.println("Você não esta apto para votar.");
        }
    }
}
