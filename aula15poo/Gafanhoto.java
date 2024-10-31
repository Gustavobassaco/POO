package aula15poo;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String login, int totAssistido, String nome, int idade, String sexo, float experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = totAssistido;
    }
    
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return super.toString() + ". Gafanhoto{" + "login=" + login + 
                ", totAssistido=" + totAssistido + '}';
    }
    
    
      
}
