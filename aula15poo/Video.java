package aula15poo;

public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0f;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas = getCurtidas()+1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float isAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float aux = (this.avaliacao + avaliacao)/ this.views;
        this.avaliacao = aux;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    
    
}
