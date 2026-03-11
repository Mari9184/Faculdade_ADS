//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            // Exercício 6

        System.out.println("Informe seu sexo ( Feminino=F se Masculino=M ):");
        String Sexo = ler.nextLine();

        System.out.println("Informe sua altura:):");
        double Altura = ler.nextDouble();

        if (Sexo.equals("F")) {
            System.out.println("Seu peso ideal é" + (52 + 0.75 * (Altura - 152.4)));
        }
        if (Sexo.equals("M")) {
            System.out.println("Seu peso ideal é" + (75.7 + 0.75 * (Altura - 152.4)));
        }
    }
}
