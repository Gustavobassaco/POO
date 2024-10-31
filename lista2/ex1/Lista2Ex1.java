
package lista2.ex1;

import java.util.ArrayList;

public class Lista2Ex1 {

    public static void main(String[] args) {
        Sapo sapo = new Sapo();
        Ra ra = new Ra();
        Leao leao = new Leao();
        Macaco macaco = new Macaco();
        ArrayList <Animal> lista = new ArrayList <>();
        lista.add(sapo);
        lista.add(ra);
        lista.add(leao);
        lista.add(macaco);
        
        for(Animal animal : lista){
            System.out.println(animal);
        }
        
       
        
        
    }
    
}
