package exerciciopraticopoo2;
public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa no aluno " + this.getNome() + " renovada.");
    }
}
