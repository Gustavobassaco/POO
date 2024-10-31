
package prova2poo;

public class ExpressoRico extends Expresso{
    private float taxa;

    public ExpressoRico(float taxa, float taxaExpresso, float valorEncomenda, float valorSelo) {
        super(taxaExpresso, valorEncomenda, valorSelo);
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
        System.out.println("Valor Expresso Rico:" + (getValorEncomenda() + getValorSelo() + getTaxaExpresso() + taxa ));
    }
    
}
