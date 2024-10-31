package lista2.ex6;

public class ExceptionB extends ExceptionA{
    
    ExceptionB(){
        super();
    }
    
    ExceptionB(int num1, int num2 ){
        super();
        this.num1 = num1;
        this.num2 = num2; 
    }
    
    @Override
    public String toString(){
        return this.num1 + "/" + this.num2 + "não é inteiro";
    }
}
