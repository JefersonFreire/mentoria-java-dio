package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{

    private Double valorDaBonificacao;

    public void calculaBonificacao(Double porcentagemBonificacao){
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ",valorDabonificacao=" + valorDaBonificacao +
                '}';
    }
}
