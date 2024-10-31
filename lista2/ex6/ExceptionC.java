package lista2.ex6;

public class ExceptionC extends ExceptionB{
    
        ExceptionC(){
        super();
        this.num1 = num1;
        this.num2 = num2; 
    }
    
    @Override
    public String toString(){
        return "Erro: Numero Negativo";
    }
}
