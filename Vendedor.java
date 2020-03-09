/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author whaty
 */
public class Vendedor extends Funcionario implements InterfaceDecimoTerceiro, InterfaceSalario{

    public Vendedor(String nome, double taxaComissao, double totalVendas) {
        super(nome, taxaComissao, totalVendas);
    }

    public Vendedor(String nome, double taxaComissao, double totalVendas, double pagamento) {
        super(nome, taxaComissao, totalVendas, pagamento);
    }

    

    @Override
    public double decimoTerceiro() {
        pagamento = (totalVendas * taxaComissao) + 1400;
        double descontos = pagamento*0.09;
        pagamento = pagamento-descontos;
        System.out.println("Vendedor: " + this.nome+ "\nDécimo Salário: " + pagamento);
        return pagamento;    
    }

    @Override
    public double salario() {
        pagamento = totalVendas * taxaComissao;
        pagamento += 1400;
        System.out.println("Vendedor: " + this.nome+ "\nSalário: " + pagamento);

        return pagamento;
    }

   
}
   
    
    
    