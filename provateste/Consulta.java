
package provateste;

public class Consulta implements ICliente{

    public String cliente;
    public String cpf;

    public Consulta
        (String cliente, String cpf) {
        this.cliente = cliente;
        this.cpf = cpf;
    }
    
    
    @Override
    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Consulta{" + "cliente=" + cliente + ", cpf=" + cpf + '}';
    }

    
    
    
}
