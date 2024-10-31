package aula11bpoo;

public class Professor {
    private String especialidade;
    private float salario;

    public Professor(String especialidade, float salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    public void aumentarSalario(){
        this.salario = this.salario*1.1f;
    }
    
}
