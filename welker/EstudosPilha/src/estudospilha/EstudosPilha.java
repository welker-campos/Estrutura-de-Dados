/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudospilha;

import java.util.Scanner;

/**
 *
 * @author 31750771
 */
public class EstudosPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Informe o tamanho da pilha: ");
        int tam = scn.nextInt();
        TadPilha tp = new TadPilha(tam);

        while (true) {

            System.out.println("Programa teste de Pilha");
            System.out.println("-----------------------");
            System.out.println(" 0 - Encerrar");
            System.out.println(" 1 - Inserir Elemento");
            System.out.println(" 2 - Extrair Elemento");
            System.out.println(" 3 - Imprimir");
            System.out.println(" 4 - Quantidade de Elementos");
            
            System.out.print("\n\nSua opcao: ");
            int opc = scn.nextInt();
            
            if (opc==0) break;
            else if (opc==1){
                System.out.print("Informe o valor: ");
                int opc1 = scn.nextInt();
                if (tp.inserir(opc1)){
                    System.out.println("Inserido OK");
                }
                else{
                    System.out.println("Falha na inserção");
                }
            }
            else if (opc==3){
                System.out.println(tp.imprimir());
            } 
            
            
            
        }

        System.out.println("Obrigado Volte Sempre");
    }

}
