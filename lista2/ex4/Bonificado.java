
package lista2.ex4;

public class Bonificado extends Assalariado{
    private float bonificacao;
    
    
    Bonificado(String nome, String sobrenome, float bonificacao,
            float salarioBase, float salarioSemanal){
        setNome(nome);
        setSobrenome(sobrenome);
        this.bonificacao = bonificacao;
        setSalarioBase(salarioBase);
        setSalarioSemanal(salarioSemanal);
    }
    
     @Override
    public float ganhos(){
        return getSalarioBase() +
                bonificacao + getSalarioSemanal() ;
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
    
   
}
