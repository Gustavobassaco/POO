/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provateste;

/**
 *
 * @author gusta
 */
public class Deposito implements ICliente{

    public String cliente;
    public String cpf;

    public Deposito(String cliente, String cpf) {
        this.cliente = cliente;
        this.cpf = cpf;
    }
    
    
    @Override
    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Deposito{" + "cliente=" + cliente + ", cpf=" + cpf + '}';
    }


    
    
}
