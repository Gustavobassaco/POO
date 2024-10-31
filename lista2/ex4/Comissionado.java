package lista2.ex4;

public class Comissionado extends Empregado{
    private int horas;
    private float taxaComissao;
    
    Comissionado(String nome, String sobrenome,
            float salarioBase, float taxa){
        setNome(nome);
        setSobrenome(sobrenome);
        setSalarioBase(salarioBase);
        setTaxaComissao(taxa);
    }

    @Override
    public float ganhos() {
        return getSalarioBase() * getTaxaComissao();
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

    public float getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(float taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}
