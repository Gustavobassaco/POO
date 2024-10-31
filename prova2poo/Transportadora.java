
package prova2poo;

import java.util.ArrayList;


public class Transportadora implements IEncomenda{
    
    private ArrayList <Encomenda> encomendas = new ArrayList<>();
    private float taxaEntrega;

    public ArrayList<Encomenda> getEncomendas() {
        return encomendas;
    }

    public Transportadora(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    

    public void setEncomendas(ArrayList<Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    
    public void imprimirArray(){
        System.out.println("Taxa da transportadora: " + getTaxaEntrega());
        for(Encomenda enc : encomendas){
            enc.imprimir();
        }
        
    }
    
    @Override
    public void nova(Encomenda encomenda) {
        encomendas.add(encomenda);
    }
    
    
    
}
