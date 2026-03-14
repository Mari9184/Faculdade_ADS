//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 2

        System.out.print("escolha um número de 1 a 12:");
        int X = ler.nextInt();

        switch (X) {
            case 1:
                System.out.print("O 1° mês é Janeiro.");
            break;
            
            case 2:
                System.out.print("O 2° mês é Fevereiro.");
            break;
            
            case 3:
                System.out.print("O 3° mês é Março.");
            break;
            
            case 4:
                System.out.print("O 4° mês é Abril.");
            break;
            
            case 5:
                System.out.print("O 5° mês é Maio.");
            break;
            
            case 6:
                System.out.print("O 6° mês é Junho.");
            break;
            
            case 7:
                System.out.print("O 7° mês é Julho.");
            break;
            
            case 8:
                System.out.print("O 8° mês é Agosto.");
            break;
            
            case 9:
                System.out.print("O 9° mês é Setembro.");
            break;
            
            case 10:
                System.out.print("O 10° mês é Outubro.");
            break;
            
            case 11:
                System.out.print("O 11° mês é Novembro.");
            break;
            
            case 12:
                System.out.print("O 12° mês é Dezembro.");
            break;
            
            default:
                System.out.print("Não possui mês com este número.");
        }
        
    }
}
