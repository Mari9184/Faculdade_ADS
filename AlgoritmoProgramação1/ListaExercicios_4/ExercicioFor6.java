//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int eleitor, voto, Canditato1=0, Canditato2=0, Canditato3=0, Canditato4=0, Nulo=0, Branco=0;
        double percN=0, percB=0;
        
        for(eleitor=1; eleitor<= 10; eleitor++){
            
            System.out.println("\n====== ELEIÇÃO ======");
            System.out.println("\n   1 - Candidato 1 \n   2 - Candidato 2 \n   3 - Candidato 3 \n   4 - Candidato 4 \n   5 - Nulo \n   6 - Branco\n");
            
            System.out.print("Informe o código do canditato que deseja votar:");
            voto = ler.nextInt();
            
            switch (voto){
                
                case 1:
                    System.out.print("\n Você votou no Canditato 1.\n");
                    Canditato1++;
                break;
                
                case 2:
                    System.out.print("\n Você votou no Canditato 2.\n");
                    Canditato2++;
                break;
                
                case 3:
                    System.out.print("\n Você votou no Canditato 3.\n");
                    Canditato3++;
                break;
                
                case 4:
                    System.out.print("\n Você votou no Canditato 4.\n");
                    Canditato4++;
                break;
                
                case 5:
                    System.out.print("\n Você votou Nulo.\n");
                    Nulo++;
                break;
                
                case 6:
                    System.out.print("\n Você votou em Branco.\n");
                    Branco++;
                break;
            }
        }
        
        percN = (Nulo * 100.0) / 10;
        percB= (Branco * 100.0) / 10;
    
        System.out.println("\n====== RESULTADOS ======\n");
            
        System.out.println("Candidato 1: " + Canditato1 + " votos");
        System.out.println("Candidato 2: " + Canditato2 + " votos");
        System.out.println("Candidato 3: " + Canditato3 + " votos");
        System.out.println("Candidato 4: " + Canditato4 + " votos");
        System.out.println("Votos nulos: " + Nulo);
        System.out.println("Votos em branco: " + Branco);
        System.out.println("Percentual de nulos: " + percN + "%");
        System.out.println("Percentual de brancos: " + percB + "%");
    }
}
