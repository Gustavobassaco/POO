package lista2.ex2;
public abstract class MembroUniversidade {
  
    public abstract float pagamento();
    public abstract String cargaStress();
    public abstract float cargaHoraria();
    public abstract String atividade();
    public abstract String locomocao();
    
        @Override
    public String toString(){
        return "\nCargo: " + this.getClass().getName().
                substring(this.getClass().getPackageName().length() + 1
                        ,this.getClass().getName().length()) +
                "\nCarga Horaria: "+ cargaHoraria() +
                "\nFuncao: " + atividade() +
                "\nCarga de Strees: " + cargaStress() +
                "\nLocomocao: " + locomocao() +
                "\nSalario: " + pagamento();
    }
}
