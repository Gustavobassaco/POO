
package lista2.ex2;

public class Bolsista extends MembroUniversidade{
    @Override
    public  float pagamento(){
        return 900.0f;
    };
    @Override
    public String cargaStress(){
        return "Relativamente Alta";
    };
    @Override
    public float cargaHoraria(){
        return 25.0f;
    };
    @Override
    public String atividade(){
        return "Estudar";
    };
    @Override
    public String locomocao(){
        return "Bicicleta doada";
    };
    

}
