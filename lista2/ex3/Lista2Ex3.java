package lista2.ex3;

import java.util.ArrayList;

public class Lista2Ex3 {

      public static void main(String[] args) {
          ArrayList<IConversaoMoeda> lista = new ArrayList<>();
          BitCoin bitcoin = new BitCoin();
          Euro euro = new Euro();
          Real real = new Real();
          
          lista.add(bitcoin);
          lista.add(euro);
          lista.add(real);
          
          for(IConversaoMoeda moeda : lista){
              System.out.println(moeda);
          }
      }
    
}
