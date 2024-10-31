package aula15poo;
import java.util.Scanner;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    Scanner entrada = new Scanner(System.in);

    //"345345", 234, "alberto", 23, "M", 3.6

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews()+1);
    }
        
    public void avaliar(){
        System.out.println("Digite a nota que o filme merece: ");
        float nota = entrada.nextFloat();
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float nota){
        this.filme.setAvaliacao(nota);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    

    
}
