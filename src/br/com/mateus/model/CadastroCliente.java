package br.com.mateus.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {

    public static void cadastrarCliente(){
        Scanner leitura = new Scanner(System.in);
        List<Cliente> dadosCliente = new ArrayList<>();
        System.out.println("Digite seu nome completo");
        var nome = leitura.nextLine();
        System.out.println("Digite um e-mail válido");
        var email = leitura.nextLine();
        System.out.println("Digite um telefone");
        var telefone = leitura.nextLine();
        Cliente cliente = new Cliente(nome, email, telefone);

    }


}
