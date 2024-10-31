
package lista2.ex2;

public class Tecnico extends MembroUniversidade{
   @Override
    public  float pagamento(){
        return 2500.0f;
    };
    @Override
    public String cargaStress(){
        return "Alta";
    };
    @Override
    public float cargaHoraria(){
        return 33.0f;
    };
    @Override
    public String atividade(){
        return "Trabalhar";
    };
    @Override
    public String locomocao(){
        return "Gol Quadrado";
    };
}
