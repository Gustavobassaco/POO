package aula12bpoo;

public class Mamifero extends Animal{

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
