package lista2.ex3;

public class BitCoin implements IConversaoMoeda {
    private float qntBitcoin;

    BitCoin(){
        this.qntBitcoin = 0.003f;
    }
    
    @Override
    public float getConversaoDolar() {
        return 57276.50f * this.qntBitcoin; 
    }
    
    public String principalFuncao(){
        return "Trading";
    }

    public float getQntBitcoin() {
        return qntBitcoin;
    }

    public void setQntBitcoin(float qntBitcoin) {
        this.qntBitcoin = qntBitcoin;
    }
    
        @Override
    public String toString(){
        return "\n\nQuantidade de bitcoin: " + getQntBitcoin() +
                "\nConvertido em Dolares: " + getConversaoDolar() +
                "\nFunção: " + principalFuncao();
    }
    
}
