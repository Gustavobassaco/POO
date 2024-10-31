
package lista2.ex2;

public class Administrativo extends MembroUniversidade{
    @Override
    public  float pagamento(){
        return 5000.0f;
    };
    @Override
    public String cargaStress(){
        return "Alta";
    };
    @Override
    public float cargaHoraria(){
        return 30.0f;
    };
    @Override
    public String atividade(){
        return "Burocracias";
    };
    @Override
    public String locomocao(){
        return "Ferrari";
    };
    

}
