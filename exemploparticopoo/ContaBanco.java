package exemploparticopoo;

public class ContaBanco {
    private int numero_conta;
    private String tipo_conta;
    private String dono_conta;
    private float saldo;
    private boolean status = false;
    
    public ContaBanco(int numero, String tipo, String dono, float saldo){
        this.numero_conta = numero;
        this.dono_conta = dono;
        this.tipo_conta = tipo;
        this.saldo = saldo;
        this.status = true;    
    }
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0f;
    }
    
    public void abrirConta(String tipo_conta){

        if(tipo_conta.equals("corrente")){
            this.saldo = 150.0f;
            this.tipo_conta = tipo_conta;
            this.status = true;
        }else if(tipo_conta.equals("poupanca")){
            this.saldo = 50.0f;
            this.tipo_conta = tipo_conta;
            this.status = true;
        }else{
            System.out.println("ERRO, tipo de conta invalido");
        }
    }
    
    public void fecharConta(){
        this.status = false;
    }
    
    public void depositar(float q){
        this.saldo += q;
    }
    
    public boolean sacar(float q){
        if(q > this.saldo){
            this.saldo -= q;
            return true;
        }else return false;
    }
    
    
    public int getNumeroConta(){
        return this.numero_conta;
    }
    public String getTipoConta(){
        return this.tipo_conta;
    }
    public String getDonoConta(){
        return this.dono_conta;
    }
    public float getSaldoConta(){
        return this.saldo;
    }
    public boolean getStatusConta(){
        return this.status;
    }
    
    public String toString(){
        return "Conta: "+ getNumeroConta()+"\nTipo: "+getTipoConta()+"\nDono: "+getDonoConta()+
                "\nSaldo: "+getSaldoConta()+"\nStatus: "+getStatusConta();
    }
    
    
}
