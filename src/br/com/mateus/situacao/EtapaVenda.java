package br.com.mateus.situacao;
import br.com.mateus.model.Cliente;
import java.util.List;


    public class EtapaVenda {


        public static void iniciarVenda(List<Cliente> vendaCliente) {
            System.out.println("Venda iniciada");
        }
        public static void vendaFechado(List<Cliente> vendaCliente) {
            System.out.println("Venda Fechado");
        }
        public static void vendaRecusada(List<Cliente> vendaCliente) {
            System.out.println("Venda Recusada");
            }
        }



