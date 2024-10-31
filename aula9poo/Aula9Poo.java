
package aula9poo;

import java.util.ArrayList;
import java.util.List;

public class Aula9Poo {

    public static void main(String [ ] args){
              MembroUniversidade membro = new ProfessorCoenc();
              System.out.println(membro.pagamento());

              membro = new BolsistaCoenc();
              System.out.println(membro.pagamento());
              System.out.println(membro.toString());

              List<MembroUniversidade> lista = new ArrayList<>();
              lista.add( new ProfessorCoenc() );
              lista.add( new BolsistaCoenc() );

              for( MembroUniversidade item : lista ){
                 System.out.println( item + " " + item.pagamento() ); 

                }

   }
}

