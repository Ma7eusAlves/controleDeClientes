package br.com.mateus.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    private static List<Cliente> dadosCliente = new ArrayList<>();

    public static void cadastrarCliente(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        var nome = leitura.nextLine();
        System.out.println("Digite um e-mail válido");
        var email = leitura.nextLine();
        System.out.println("Digite um telefone");
        var telefone = leitura.nextLine();
        Cliente novoCliente = new Cliente(nome, email, telefone);
        dadosCliente.add(novoCliente);

    }
        public static List<Cliente> getDadosCliente() {
        return dadosCliente;
    }


}
