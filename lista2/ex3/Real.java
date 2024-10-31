package lista2.ex3;

public class Real implements IConversaoMoeda{
    private float qntReal;

    Real(){
        this.qntReal = 12334.54f;
    }
    
    @Override
    public float getConversaoDolar() {
        return 0.18f * this.qntReal; 
    }
    
    public String principalFuncao() {
        return "Lavar Dinheiro de Corrupção";
    }

    public float getQntBitcoin() {
        return qntReal;
    }

    public void setQntBitcoin(float qntBitcoin) {
        this.qntReal = qntBitcoin;
    }
    
        @Override
    public String toString(){
        return "\n\nQuantidade de Real: " + getQntBitcoin() +
                "\nConvertido em Dolares: " + getConversaoDolar() +
                "\nFunção: " + principalFuncao();
    }
}
