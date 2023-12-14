package br.com.mateus.principal;
import br.com.mateus.model.CadastroCliente;
import br.com.mateus.model.ConsultaCliente;

import java.util.InputMismatchException;
import java.util.Scanner;
import static br.com.mateus.situacao.EtapaVenda.situacaoVenda;

public class Principal {
    public static void main(String[] args) {
       try {
           Scanner leitura = new Scanner(System.in);

            int opcao;

            do {
                System.out.println("---------------------------------");
                System.out.println("Sistema para controle de clientes");
                System.out.println("---------------------------------");
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Consultar cliente");
                System.out.println("3 - Etapa da venda");
                System.out.println("4 - Sair");
                opcao = leitura.nextInt();
                leitura.nextLine();

             switch (opcao){
                 case 1:
                     CadastroCliente.cadastrarCliente();
                     break;
                 case 2:
                     ConsultaCliente.exibirClientesCadastrados(CadastroCliente.getDadosCliente());
                     break;
                 case 3:
                     situacaoVenda();
                     break;
                 case 4:
                     break;
             }

        }while (opcao != 4);
       }catch (InputMismatchException e){
           System.out.println("Entrada inválida. Por favor, insira um valor numérico.");

       }
    }
}
