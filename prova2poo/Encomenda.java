
package prova2poo;

public abstract class Encomenda {
    private float valorEncomenda;
    private Selo selo;
    
    public abstract void imprimir();

    public Encomenda(float valorEncomenda, float valorSelo) {
        this.valorEncomenda = valorEncomenda;
        selo = new Selo(valorSelo);
    }
    
    public float getValorSelo(){
        return selo.getValor();
    }

    public float getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(float valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }

    public Selo getSelo() {
        return selo;
    }

    public void setSelo(Selo selo) {
        this.selo = selo;
    }
    
}
