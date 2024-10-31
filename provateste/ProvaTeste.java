
package provateste;

import java.util.ArrayList;

public class ProvaTeste {

    public static void main(String[] args) {

        ArrayList<ICliente> lista = new ArrayList<>();
        ContaCorrente corrente = new ContaCorrente(1233.0, 12.0, "3242-2342-34");
        ContaPoupanca poupanca = new ContaPoupanca(155.6, 4.0, "2345646456");
        ContaSalario salario = new ContaSalario(234.7, 75.45, "674564564");
        Consulta consulta = new Consulta("Cleiton", "23435345");
        Saque saque = new Saque("Vetor", "34534534");
        Deposito deposito = new Deposito("Rodrigo", "6546456");
        
        lista.add(corrente);
        lista.add(poupanca);
        lista.add(salario);
        lista.add(consulta);
        lista.add(saque);
        lista.add(deposito);
        
        for(ICliente cliente : lista){
            System.out.println(cliente);
        }
          
        

        
        
    }
    
}
