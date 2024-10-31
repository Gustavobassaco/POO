package aula12bpoo;

public class Reptil extends Animal{
    private String cor escama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void comer() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
}
