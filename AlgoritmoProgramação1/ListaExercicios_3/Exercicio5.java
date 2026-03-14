//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 5
        
        System.out.println("====QUAL OPERAÇÃO VOCÊ DESEJA FAZER?==== \n M - média entre os numeros digitados\n S - diferença do maior pelo menor\n P - produto entre os números digitados\n D - divisão do primeiro pelo segundo");
        String P = ler.nextLine();
        
        System.out.print(" Informe o 1° valor: ");
        double N1 = ler.nextDouble();

        System.out.print(" Informe o 2° valor: ");
        double N2 = ler.nextDouble();

        switch (P) {
            case "M":
                System.out.println("O resultado da Media entre esses valores é:"+((N1+N2)/2));
            break;
            
            case "S":
                System.out.println("A diferença entre esses valores é:"+(N1-N2));
            break;
            
            case "P":
                System.out.println("O resultado do produto desses valores é:"+(N1*N2));
            break;
           
            case "D":
                System.out.println("O resultado da divisão desses valores é:"+(N1/N2));
            break;
           
            default:
                System.out.print("Não possui este plano de trabalho.");
        }
    }
}
