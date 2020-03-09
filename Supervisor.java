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
public class Supervisor extends Funcionario implements InterfaceDecimoTerceiro, InterfaceSalario{


    public Supervisor(String nome) {
        super(nome);
    }

    public Supervisor(String nome, double taxaComissao, double totalVendas, double pagamento) {
        super(nome, taxaComissao, totalVendas, pagamento);
    }
    
    

    public Supervisor() {
    }

    @Override
    public double decimoTerceiro() {
        pagamento = 3000.00;
        double descontos = 0.11;
        descontos = pagamento*descontos;
        pagamento = pagamento-descontos;
        System.out.println("Supervisor: " + this.nome+ "\nDécimo Salário: " + pagamento);
        return pagamento;

    }

    @Override
    public double salario() {
        pagamento = 3000.00;
        System.out.println("Supervisor: " + this.nome+ "\nSalário: " + pagamento);
        return pagamento;
        
    }

   

   
    
}
