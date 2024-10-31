
package provateste;

public class Saque implements ICliente{

    public String cliente;
    public String cpf;

    public Saque(String cliente, String cpf) {
        this.cliente = cliente;
        this.cpf = cpf;
    }
    
    
    @Override
    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Saque{" + "cliente=" + cliente + ", cpf=" + cpf + '}';
    }
    
    
}
