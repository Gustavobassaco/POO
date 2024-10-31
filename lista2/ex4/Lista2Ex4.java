package lista2.ex4;

import java.util.ArrayList;

public class Lista2Ex4 {
    public static void main(String[] args) {
        float salarioBase = 988.7f;
        float bonificacao = 900.0f;
        float salarioSemanal = 450.0f;
        float taxa = 1.5f;
        int horas = 8;
                
        Bonificado b1 = new Bonificado("joao", "silva", bonificacao,
            salarioBase, salarioSemanal);
        Comissionado c1 = new Comissionado("Maria", "Soares",
            salarioBase, taxa);
        Horista h1 = new Horista("Jomar", "Silva Soares",
            salarioBase, horas );
        
        ArrayList <Empregado> lista = new ArrayList <> ();
        lista.add(b1);
        lista.add(c1);
        lista.add(h1);
        
        for(Empregado emp : lista){
            emp.imprimir();
            System.out.println(emp.ganhos());
        }
        
        
        
    }
    
}
