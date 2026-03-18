//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 6

        System.out.println("===========Lanchonete===========\n");
        System.out.println(" 100 - Cachorro Quente - R$1,20 \n 101 - Bauru           - R$1,30 \n 102 - Bauru com ovo   - R$1,50\n 103 - Hambúrguer      - R$1,20 \n 104 - Cheeseburguer   - R$1,30\n 105 - Refrigerante    - R$1,00 \n");

        System.out.print("Digite o codigo do produto: ");
        int P = ler.nextInt();

        System.out.print("Quantidade de produtos que deseja: ");
        int Q = ler.nextInt();

        double Total;

        switch (P) {
            case 100:
                Total = 1.20*Q;
                System.out.printf(" Você comprou %d Cachorro(s) Quente - Valor da compra: %.2f ", Q, Total);
                break;

            case 101:
                Total = 1.30*Q;
                System.out.printf(" Você comprou %d Bauru - Valor da compra: %.2f ", Q, Total);
                break;

            case 102:
                Total = 1.50*Q;
                System.out.printf(" Você comprou %d Bauru com ovo - Valor da compra: %.2f ", Q, Total);
                break;

            case 103:
                Total = 1.20*Q;
                System.out.printf(" Você comprou %d Hambúrguer - Valor da compra: %.2f ", Q, Total);
                break;

            case 104:
                Total = 1.30*Q;
                System.out.printf(" Você comprou %d Cheeseburguer - Valor da compra: %.2f ", Q, Total);
                break;

            case 105:
                Total = 1.00*Q;
                System.out.printf(" Você comprou %d Hambúrguer - Valor da compra: %.2f ", Q, Total);
                break;


            default:
                System.out.print("Não possui este lanche.");
        }
    }
}
