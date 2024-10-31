
package prova2poo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Prova2POO {

    private static Exception Excep(float retorno) {
        throw new UnsupportedOperationException("Valor negativo");
    }
    
    public class Excep extends Exception{
        
        float num;

        public Excep(float num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Excep{" + "num é menor do que 0";
        }
        
    }

    public static float VEncomenda(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da encomenda: ");
        float retorno = 0;
        
        try{
            retorno = scan.nextFloat();
            
            if(retorno < 0)
            throw Excep(retorno);
                
                
        }catch(Excep e){
            System.out.println("Aconteceu um erro");
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(Prova2POO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    
 
    public static void main(String[] args) {
        
        float vPremium = VEncomenda();
        float vConvtop = VEncomenda();
        float vConvPobre = VEncomenda();
        float vConvRico = VEncomenda();
        
       Premium premium = new Premium(8.4f,vPremium , 15.5f);
       ConvencionalTop convTop = new ConvencionalTop(23.4f, 45.5f, vConvtop, 7.0f);
       ExpressoPobre convPobre = new ExpressoPobre(13.4f, 35.5f, vConvPobre, 6.0f);
       ExpressoRico convRico = new ExpressoRico(33.4f, 56.5f, vConvRico, 11.0f);
       
       Transportadora transportadora = new Transportadora(6.5f);
       
       transportadora.nova(premium);
       transportadora.nova(convTop);
       transportadora.nova(convPobre);
       transportadora.nova(convRico);
       
       transportadora.imprimirArray();
    }
    
}
