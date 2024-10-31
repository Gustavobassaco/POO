
package lista2.ex1;

public class Animal {
    public String nome;
    
    

    public String animal(){
        return this.getClass().getName().
                substring(this.getClass().getPackageName().length() + 1
                        ,this.getClass().getName().length());
    }
    
    public String locomove(){
        return "anda";
    }
    
    public String alimentacao(){
        return "come";
    }
    
    public String pele(){
        return "pele";
    }
    
    public float tamanho(){
        return 34.3f;
    }
    
    public int quantMembros(){
        return 4;
    }
    
    @Override
    public String toString(){
        return "\n\nTipo de animal: " + animal() +
                "\nForma de Locomoão: "+ locomove() +
                "\nAlimentação: " + alimentacao() +
                "\nPele: "+ pele()+
                "\nQuantidade de Membros: " + quantMembros();
    }
    
}
