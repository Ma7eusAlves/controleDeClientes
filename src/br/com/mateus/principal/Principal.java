package br.com.mateus.principal;
import br.com.mateus.model.CadastroCliente;
import br.com.mateus.model.ConsultaCliente;
import java.util.InputMismatchException;
import java.util.Scanner;
import static br.com.mateus.situacao.EtapaVenda.situacaoVenda;

public class Principal {
    public static void main(String[] args) {

           Scanner leitura = new Scanner(System.in);

            int opcao = 0;

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
                      leitura.nextLine();
                  } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número inteiro válido.");
                    return;
                }

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

                 default:
                     System.out.println("Entrada inválida. Por favor, insira um valor numérico.");

             }
                  leitura.close();

        }while (opcao != 4);

       }
    }

