//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cod_prodt, qnt_prodt, qnt_total=0, comprando = 1, lst_compra, qnt_CachorroQuente = 0, qnt_Bauru = 0, qnt_BauruOvo = 0, qnt_Cheeseburguer = 0, qnt_Hamburguer = 0, qnt_refrigerante = 0;
        double Prec_prodt, prec_total=0;

        do {
            
            System.out.println("\n===========Lanchonete=========== \n");
            
            System.out.println(" 100 - Cachorro Quente - R$1,20 \n 101 - Bauru           - R$1,30 \n 102 - Bauru com ovo   - R$1,50\n 103 - Hambúrguer      - R$1,20 \n 104 - Cheeseburguer   - R$1,30\n 105 - Refrigerante    - R$1,00 \n");
    
            System.out.print("Digite o codigo do produto: ");
            cod_prodt = ler.nextInt();
    
            System.out.print("Quantidade de produtos que deseja: ");
            qnt_prodt = ler.nextInt();
            
            System.out.println("===================================");
    
            switch (cod_prodt) {
                case 100:
                    Prec_prodt = 1.20*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Cachorro(s) Quente - Valor da compra: %.2f\n", qnt_prodt, Prec_prodt);
                    qnt_CachorroQuente += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
    
                case 101:
                    Prec_prodt = 1.30*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Bauru - Valor da compra: %.2f\n ", qnt_prodt, Prec_prodt);
                    qnt_Bauru += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
    
                case 102:
                    Prec_prodt = 1.50*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Bauru com ovo - Valor da compra: %.2f\n ", qnt_prodt, Prec_prodt);
                    qnt_BauruOvo += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
    
                case 103:
                    Prec_prodt = 1.20*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Hambúrguer - Valor da compra: %.2f\n", qnt_prodt, Prec_prodt);
                    qnt_Hamburguer += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
    
                case 104:
                    Prec_prodt = 1.30*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Cheeseburguer - Valor da compra: %.2f\n", qnt_prodt, Prec_prodt);
                    qnt_Cheeseburguer += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
    
                case 105:
                    Prec_prodt = 1.00*qnt_prodt;
                    System.out.printf("\nVocê comprou %d Refrigerante - Valor da compra: %.2f\n", qnt_prodt, Prec_prodt);
                    qnt_refrigerante += qnt_prodt;
                    prec_total += Prec_prodt;
                    qnt_total += qnt_prodt;
                    break;
                    
                default:
                    System.out.printf("\nNão possui este lanche.");
                    
            }
            System.out.printf("\nDeseja adicinar outro item ao carrinho? (1-sim/ 0-não)\n");
            comprando = ler.nextInt();
            
        }while (comprando == 1);
            
            System.out.println("\n===========Nota Fiscal===========");

            if (qnt_Hamburguer > 0){
                System.out.printf("\nVocê comprou %d Hambúrguer - Valor: %.2f\n", qnt_Hamburguer, (qnt_Hamburguer*1.20));
            }
            
            if (qnt_CachorroQuente > 0){
                System.out.printf("\nVocê comprou %d Cachorro Quente - Valor: %.2f\n", qnt_CachorroQuente, (qnt_CachorroQuente*1.20));
            }

            if (qnt_Bauru > 0){
                System.out.printf("\nVocê comprou %d Bauru - Valor: %.2f\n", qnt_Bauru, (qnt_Bauru*1.30));
            }
            
            if (qnt_BauruOvo > 0){
                System.out.printf("\nVocê comprou %d Bauru com ovo - Valor: %.2f\n", qnt_BauruOvo, (qnt_BauruOvo*1.50));
            }
            
            if (qnt_Cheeseburguer > 0){
                System.out.printf("\nVocê comprou %d Cheeseburguer - Valor: %.2f\n", qnt_Cheeseburguer, (qnt_Cheeseburguer*1.30));
            }
            
            if (qnt_refrigerante > 0){
                System.out.printf("\nVocê comprou %d Refrigerante - Valor: %.2f\n", qnt_refrigerante, (qnt_refrigerante*1.00));
            }
            
            System.out.println("===========================================");
            
            System.out.printf("Quantidade Total:%d \n",qnt_total);
            System.out.printf("Valor Total:%.2f \n",prec_total);
    }
}
