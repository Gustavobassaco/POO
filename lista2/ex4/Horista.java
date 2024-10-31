package lista2.ex4;

public class Horista extends Empregado{
    private int horas;

    Horista(String nome, String sobrenome, float salario,
            int horas){
        this.horas = horas;
        setNome(nome);
        setSobrenome(sobrenome);
        setSalarioBase(salario);
    }
    
    @Override
    public float ganhos() {
        return getSalarioBase() * this.horas;
    }

    @Override
    public void imprimir() {
        System.out.println("\n\nNome: " + getNome() +
                "\nSobrenome: " + getSobrenome() + 
                "\nfunção; " + this.getClass().
                getName().substring(this.getClass().
                getPackageName().length() + 1,this.getClass().
                getName().length()) +
                "\nGanhos: " + ganhos());
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    
    
}
