
package provateste;

public class ContaPoupanca extends Conta{
    private double mensalidade;
    private String numeroContaPoupanca;
    
    public ContaPoupanca(){
        
    }
    
    public ContaPoupanca(double saldo ,double valor, String numero){
        super(saldo);
        this.mensalidade = valor;
        this.numeroContaPoupanca = numero;
    }

    public void PagarContaNissan(double valorRetirada){
        System.out.println("Skyline pago");
    }
    
    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double valor) {
        this.mensalidade = valor;
    }

    public String getNumeroContaPoupanca() {
        return numeroContaPoupanca;
    }

    public void setNumeroContaPoupanca(String NumeroContaPoupanca) {
        this.numeroContaPoupanca = NumeroContaPoupanca;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "mensalidade=" + mensalidade + ", numeroContaPoupanca=" + numeroContaPoupanca + '}';
    }
    
    
    
}
