package lista2.ex1;
public class Ra extends Anfibio{
        @Override
     public String locomove(){
        return "pula";
    }
    @Override
    public String alimentacao(){
        return "come insetos";
    }
    @Override
    public String pele(){
        this.quantidadeEscamas = "poucas";
        return "pele com escamas";
    }
    @Override
    public float tamanho(){
        return 44.6f;
    }
    @Override
    public int quantMembros(){
        return 4;
    }
}
