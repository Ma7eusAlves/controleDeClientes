package br.com.mateus.principal;
import br.com.mateus.dados.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Cliente> dadosCliente = new ArrayList<>();

        System.out.println("Cadastro de Clientes");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Consultar cliente");
        System.out.println("3 - Sair");
        var opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao){
           case 1:
               System.out.println("Digite o nome do cliente:");
               var nome = leitura.nextLine();
               System.out.println("Digite um e-mail válido:");
               var email = leitura.nextLine();
               System.out.println("Digite um telefone:");
               var telefone = leitura.nextLine();
               dadosCliente.add( new Cliente(nome, email, telefone));
               System.out.println(dadosCliente);
               leitura.close();
               break;
           case 2:

                break;
           case 3:
               break;
       }


    }
}
