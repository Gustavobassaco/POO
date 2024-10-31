package lista2.ex1;

public class Macaco extends Terrestre{
        @Override
     public String locomove(){
        return "pula de galho em galho";
    }
    @Override
    public String alimentacao(){
        return "come frutas";
    }
    @Override
    public String pele(){
        this.quantidadePelos = "poucos";
        return "Pele com pelos";
    }
    @Override
    public float tamanho(){
        return 123.6f;
    }
    @Override
    public int quantMembros(){
        return 4;
    }
}
