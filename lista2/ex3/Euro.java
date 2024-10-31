package lista2.ex3;

public class Euro implements IConversaoMoeda {
     private float qntEuro;

    Euro(){
        this.qntEuro = 2345.34f;
    }
    
    @Override
    public float getConversaoDolar() {
        return 1.13f * this.qntEuro; 
    }
    
    public String principalFuncao() {
        return "Impedir confrontos entre paises";
    }

    public float getQntBitcoin() {
        return qntEuro;
    }

    public void setQntBitcoin(float qntBitcoin) {
        this.qntEuro = qntBitcoin;
    }
    
        @Override
    public String toString(){
        return "\n\nQuantidade de Euro: " + getQntBitcoin() +
                "\nConvertido em Dolares: " + getConversaoDolar() +
                "\nFunção: " + principalFuncao();
    }
    
}
