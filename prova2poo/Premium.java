
package prova2poo;

public class Premium extends Encomenda{
    private float taxa;

    public Premium(float taxa, float valorEncomenda, float valorSelo) {
        super(valorEncomenda, valorSelo);
        this.taxa = taxa;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Valor Premium:" + (getValorEncomenda() + getValorSelo() +  taxa ));
    }
}
