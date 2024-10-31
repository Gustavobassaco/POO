
package provateste;

public class ContaSalario extends Conta{
    private double semanidade;
    private String numeroContaSalario;
    
    public ContaSalario(){
        
    }

    public ContaSalario(double semanidade,  double valor,String numeroContaSalario) {
        super(valor);
        this.semanidade = semanidade;
        this.numeroContaSalario = numeroContaSalario;
    }

    public void PagarContaFerrari(double valorRetirada){
        System.out.println("Ferrari paga");
    }
    
    public double getSemanidade() {
        return semanidade;
    }

    public void setSemanidade(double valor) {
        this.semanidade = valor;
    }

    public String getNumeroContaSalario() {
        return numeroContaSalario;
    }

    public void setNumeroContaSalario(String NumeroContaSalario) {
        this.numeroContaSalario = NumeroContaSalario;
    }

    @Override
    public String toString() {
        return "ContaSalario{" + "semanidade=" + semanidade + ", numeroContaSalario=" + numeroContaSalario + '}';
    }
    
    
    
}
