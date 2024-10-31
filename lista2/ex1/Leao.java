package lista2.ex1;

public class Leao extends Terrestre{
    @Override
     public String locomove(){
        return "corre";
    }
    @Override
    public String alimentacao(){
        return "come carne";
    }
    @Override
    public String pele(){
        this.quantidadePelos = "muitos";
        return "pele com pelos";
    }
    @Override
    public float tamanho(){
        return 333.6f;
    }
    @Override
    public int quantMembros(){
        return 4;
    }
    
}
