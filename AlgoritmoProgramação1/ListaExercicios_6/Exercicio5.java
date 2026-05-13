//Mariane Santana da Silva RA:1143431607
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 7: ");
        int numero = ler.nextInt();

        String dia = diasSemana(numero);

        System.out.println(dia);

        ler.close();
    }

    public static String diasSemana(int dia){
    
        switch (dia) {

            case 1:
                return "Domingo";

            case 2:
                return "Segunda-feira";

            case 3:
                return "Terça-feira";

            case 4:
                return "Quarta-feira";

            case 5:
                return "Quinta-feira";

            case 6:
                return "Sexta-feira";

            case 7:
                return "Sábado";

            default:
                return "Dia da semana inválido";
        }   
    }
}
