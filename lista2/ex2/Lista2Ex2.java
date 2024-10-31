
package lista2.ex2;

import java.util.ArrayList;

public class Lista2Ex2 {


    public static void main(String[] args) {
        ArrayList<MembroUniversidade> universidade = new ArrayList<>();
        Administrativo adm = new Administrativo();
        Professor prof = new Professor();
        Tecnico tec = new Tecnico();
        Bolsista bols = new Bolsista();
        
        universidade.add(adm);
        universidade.add(prof);
        universidade.add(tec);
        universidade.add(bols);
        
        
        for(MembroUniversidade membro :  universidade){
            // as funções estão sendo chamadas no toString do
            // MembroUniversidade
            System.out.println(membro);
        }
    }
    
}
