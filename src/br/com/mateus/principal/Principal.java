package br.com.mateus.principal;
import java.util.Scanner;
import static br.com.mateus.model.CadastroCliente.cadastrarCliente;
import static br.com.mateus.model.ConsultaCliente.consulta;
import static br.com.mateus.situacao.EtapaVenda.situacaoVenda;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
            int opcao;

            do {

                System.out.println("Cadastro de Clientes");
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Consultar cliente");
                System.out.println("3 - Etapa da venda");
                System.out.println("4 - Sair");
                opcao = leitura.nextInt();
                leitura.nextLine();

             switch (opcao){
                 case 1:
                     cadastrarCliente();
                     break;
                 case 2:
                     consulta();
                     break;
                 case 3:
                     situacaoVenda();
                     break;
                 case 4:
                     break;
             }

        }while (opcao != 4);

    }
}
