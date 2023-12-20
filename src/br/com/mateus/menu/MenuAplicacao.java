package br.com.mateus.menu;

public class MenuAplicacao {

    public static void exibirMenuPrincipal() {
        System.out.println("---------------------------------");
        System.out.println("Sistema para controle de clientes");
        System.out.println("---------------------------------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Consultar cliente");
        System.out.println("3 - Etapa da venda");
        System.out.println("4 - Sair");
    }

    public static void exibirMenuEtapaVenda() {
        System.out.println("--------------------------");
        System.out.println("Menu da Etapa de Venda");
        System.out.println("--------------------------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Realizar venda");
        System.out.println("2 - Fechar venda");
        System.out.println("3 - Recusar venda");
        System.out.println("0 - Voltar ao menu principal");

    }
}
