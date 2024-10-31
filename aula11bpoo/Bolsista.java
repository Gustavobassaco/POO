package aula11bpoo;
public class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(int bolsa, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.bolsa = bolsa;
    }

    public Bolsista(){
        super();
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

       @Override
    public String toString() {
        return "Aluno(Bolsista){ Nome= " + this.getNome() + ", idade= " + this.getIdade() + 
                ", Sexo= "+ this.sexo+ ", matricula=" + this.getMatricula() +
                ", Bolsa= "+ this.bolsa + ", curso=" + this.getCurso() + '}';
    }
    
    
    public void renovarBolsa(){
        System.out.println("Bolsa no aluno " + this.getNome() + " renovada.");
    }
    
       public void parMensalidade(){
        System.out.println("Mensalidade do bolsista "+ this.getNome()+" paga.");
    }
}
