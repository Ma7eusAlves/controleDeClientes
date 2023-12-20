package br.com.mateus.principal;
import br.com.mateus.menu.MenuAplicacao;
import br.com.mateus.model.CadastroCliente;
import br.com.mateus.model.ConsultaCliente;
import br.com.mateus.situacao.EtapaVenda;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        EtapaVenda etapaVenda = new EtapaVenda();
        MenuAplicacao menuAplicacao = new MenuAplicacao();
        int opcao = 0;

            //menu de opções
            //inicio do laço
            do {
                menuAplicacao.exibirMenuPrincipal();
                try {
                    opcao = leitura.nextInt();
                    leitura.nextLine();  // Limpar o buffer de entrada
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número inteiro válido.");
                    leitura.nextLine();  // Limpar o buffer de entrada
                    continue;  // Continue o loop
                }

            //escolha das opções
             switch (opcao){
                 case 1:
                     CadastroCliente.cadastrarCliente();
                     etapaVenda.iniciarVenda();
                     System.out.println("0 - Voltar ao menu principal");
                     int voltar = leitura.nextInt();
                     if (voltar == 0) {
                         opcao = 0; // Volta o menu
                     }
                     break;
                 case 2:
                     ConsultaCliente.exibirClientesCadastrados(CadastroCliente.getDadosCliente());
                     System.out.println("0 - Voltar ao menu principal");
                     voltar = leitura.nextInt();
                     if (voltar == 0) {
                         opcao = 0; // Volta o menu
                     }
                     break;
                 case 3:

//                     if (!vendaIniciada) {
//                     EtapaVenda.iniciarVenda(CadastroCliente.getDadosCliente());
//                     vendaIniciada = true;
//                 } else {
//                     EtapaVenda.vendaRecusada(CadastroCliente.getDadosCliente());
//                     vendaIniciada = false;
//                 }
                     break;
                 case 4:
                     break;

                 default:
                     System.out.println("Entrada inválida. Por favor, insira um valor numérico.");

             }


        }while (opcao != 4); //final do laço com condição
        leitura.close();
       }
    }

