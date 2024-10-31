
package provateste;


public abstract class Conta implements ICliente{

    private String cliente;

        @Override
    public String getCliente() {
        return cliente;
    }

    public void setNome(String nome) {
        this.cliente = cliente;
    }
    
    
    private double saldo;
    
    public Conta(){
        
    }
    
    public Conta(double valor){
        this.saldo = valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}
