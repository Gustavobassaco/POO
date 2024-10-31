
package prova2poo;

public abstract class Expresso extends Encomenda{
    protected float taxaExpresso;

    public Expresso(float taxaExpresso, float valorEncomenda, float valorSelo) {
        super(valorEncomenda, valorSelo);
        this.taxaExpresso = taxaExpresso;
    }

    public float getTaxaExpresso() {
        return taxaExpresso;
    }

    public void setTaxaExpresso(float taxaExpresso) {
        this.taxaExpresso = taxaExpresso;
    }
    
}
