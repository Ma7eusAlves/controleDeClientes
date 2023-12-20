package br.com.mateus.situacao;
import br.com.mateus.menu.MenuAplicacao;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EtapaVenda {
    private static boolean vendaIniciada = false;
    private Scanner leitura = new Scanner(System.in);
    MenuAplicacao menuAplicacao =  new MenuAplicacao();
    public void iniciarVenda() {
        int opcao = 0;

        do {
            menuAplicacao.exibirMenuEtapaVenda();

            try {
                opcao = leitura.nextInt();
                leitura.nextLine();  // Limpar o buffer de entrada

                switch (opcao) {
                    case 1:
                        System.out.println("Venda iniciada");
                        vendaIniciada = true;
                        System.out.println("0 - Voltar ao menu principal");
                        int voltar = leitura.nextInt();
                        if (voltar == 0) {
                            opcao = 0; // Volta o menu
                        }

                        break;
                    case 2:
                        System.out.println("Venda Fechada");
                        vendaIniciada = true;
                        System.out.println("Obrigado por comprar conosco");
                        System.out.println("0 - Voltar ao menu principal");
                        voltar = leitura.nextInt();
                        if (voltar == 0) {
                            opcao = 0; // Volta o menu
                        }
                        break;
                    case 3:
                        System.out.println("Venda Recusada");
                        System.out.println("0 - Voltar ao menu principal");
                        voltar = leitura.nextInt();
                        if (voltar == 0) {
                            opcao = 0; // Volta o menu
                        }
                        vendaIniciada = false;
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                leitura.nextLine();  // Limpar o buffer de entrada
            }

        } while (opcao != 3);

    }


}

//        public static void iniciarVenda(List<Cliente> vendaCliente) {
//
//            System.out.println("Venda iniciada");
//        }
//        public static void vendaFechado(List<Cliente> vendaCliente) {
//
//            System.out.println("Venda Fechado");
//        }
//        public static void vendaRecusada(List<Cliente> vendaCliente) {
//            System.out.println("Venda Recusada");
//            }






