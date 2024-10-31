
package provateste;

public class ContaCorrente extends Conta{
    private double anuidade;
    private String numeroContaCorrente;
    
    public ContaCorrente(){
        
    }

    

    public ContaCorrente(double anuidade, double valor,  String numeroContaCorrente) {
        super(valor);
        this.anuidade = anuidade;
        this.numeroContaCorrente = numeroContaCorrente;
    }
    
    
    
    public void PagarContaMazda(double valorRetirada){
        System.out.println("Mazda paga");
    }

    public double getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(double valor) {
        this.anuidade = valor;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String NumeroContaCorrente) {
        this.numeroContaCorrente = NumeroContaCorrente;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "anuidade=" + anuidade + ", numeroContaCorrente=" + numeroContaCorrente + '}';
    }
    
    
    
}
