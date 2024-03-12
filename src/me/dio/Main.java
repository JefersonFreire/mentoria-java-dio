package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args){
       /* Endereco endereco = new Endereco();
        endereco.setRua("Vereador José Pinheiro");
        System.out.println(endereco.getRua());*/

        Endereco endereco =
                new Endereco("Rua funcionário", "complemento funcionário", "bairro funcionário");
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Jeferson Vendedor");
        vendedor.setDocumento("369.852.147-25");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        OperadorDeCaixa operadorDeCaixa =
                new OperadorDeCaixa("Jeferson Op Caixa", "258.963.852-44", 2000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("-----");


        Gerente gerente = new Gerente();
        gerente.setNome("Jeferson Gerente");
        gerente.setDocumento("789.654.321-99");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
    }
}
