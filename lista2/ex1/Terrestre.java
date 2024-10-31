package lista2.ex1;

public class Terrestre extends Animal{
    protected String quantidadePelos = "pouco";
    
        @Override
    public String toString(){
        return "\n\nTipo de animal: " + animal() +
                "\nForma de Locomoão: "+ locomove() +
                "\nAlimentação: " + alimentacao() +
                "\nPele: "+ pele()+
                "\nQuantidade de Membros: " + quantMembros() +
                "\nQuantidade de Pelos: " + this.quantidadePelos;
                
    }
}
