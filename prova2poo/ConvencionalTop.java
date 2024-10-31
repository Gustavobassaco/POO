
package prova2poo;


public class ConvencionalTop extends Convencional{
    private float taxa;

    public ConvencionalTop(float taxa, float taxaConvencional, float valorEncomenda, float valorSelo) {
        super(taxaConvencional, valorEncomenda, valorSelo);
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
        System.out.println("Valor Convencional top:" + (getValorEncomenda() + getValorSelo() + getTaxaConvencional() + taxa ));
    }
    
}
