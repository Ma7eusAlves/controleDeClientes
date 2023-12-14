package br.com.mateus.model;
import java.util.List;
public class ConsultaCliente {

    public static void exibirClientesCadastrados(List<Cliente> dadosCliente) {
        System.out.println("\nClientes cadastrados:");
        for (Cliente cliente : dadosCliente) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("E-mail: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("-----");
        }
    }

}
