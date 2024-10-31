package aula11bpoo;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public Aluno(){
        super();
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{ Nome= " + this.nome + ", idade= " + this.idade + 
                ", Sexo= "+ this.getSexo()+ ", matricula=" + matricula + ", curso=" + curso + '}';
    }

    
    
    public void parMensalidade(){
        System.out.println("Mensalidade do aluno "+ this.getNome()+" paga.");
    }
}
