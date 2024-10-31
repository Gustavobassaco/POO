package lista2.ex4;

public  abstract class Empregado {
    private String nome;
    private String sobrenome;
    private float salarioBase;
    
    public abstract float ganhos();
    public abstract void imprimir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
}
