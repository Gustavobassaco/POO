
package prova2poo;


public abstract class Convencional extends Encomenda{
    protected float taxaConvencional;

    public Convencional(float taxaConvencional, float valorEncomenda, float valorSelo) {
        super(valorEncomenda, valorSelo);
        this.taxaConvencional = taxaConvencional;
    }

    public float getTaxaConvencional() {
        return taxaConvencional;
    }

    public void setTaxaConvencional(float taxaConvencional) {
        this.taxaConvencional = taxaConvencional;
    }
    
}
