package br.com.mateus.principal;
import br.com.mateus.model.CadastroCliente;
import br.com.mateus.model.ConsultaCliente;
import br.com.mateus.situacao.EtapaVenda;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private static boolean vendaIniciada = false;

    public static void main(String[] args) {
           Scanner leitura = new Scanner(System.in); //en

        int opcao = 0;

            //menu de opções
            //inicio do laço
            do {
                System.out.println("---------------------------------");
                System.out.println("Sistema para controle de clientes");
                System.out.println("---------------------------------");
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Consultar cliente");
                System.out.println("3 - Etapa da venda");
                System.out.println("4 - Sair");

                try {
                    opcao = leitura.nextInt();
                    leitura.nextLine();  // Limpar o buffer de entrada
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número inteiro válido.");
                    leitura.nextLine();  // Limpar o buffer de entrada
                    continue;  // Continue o loop
                }
                if (opcao < 1 || opcao > 4) {
                    System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
                    continue;  // Continue o loop
                }
            //escolha das opções
             switch (opcao){
                 case 1:
                     CadastroCliente.cadastrarCliente();
                     break;
                 case 2:
                     ConsultaCliente.exibirClientesCadastrados(CadastroCliente.getDadosCliente());
                     break;
                 case 3:
                     if (!vendaIniciada) {
                     EtapaVenda.iniciarVenda(CadastroCliente.getDadosCliente());
                     vendaIniciada = true;
                 } else {
                     EtapaVenda.vendaRecusada(CadastroCliente.getDadosCliente());
                     vendaIniciada = false;
                 }
                     break;
                 case 4:
                     break;

                 default:
                     System.out.println("Entrada inválida. Por favor, insira um valor numérico.");

             }

        }while (opcao != 4); //final do laço com condição

       }
    }

