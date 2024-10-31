package lista2.ex1;

public class Anfibio extends Animal{
    protected String quantidadeEscamas = "pouco";
    
            @Override
    public String toString(){
        return "\n\nTipo de animal: " + animal() +
                "\nForma de Locomoão: "+ locomove() +
                "\nAlimentação: " + alimentacao() +
                "\nPele: "+ pele()+
                "\nQuantidade de Membros: " + quantMembros() +
                "\nQuantidade de Escamas: " + this.quantidadeEscamas;
                
    }
}
