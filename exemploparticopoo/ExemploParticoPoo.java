package exemploparticopoo;

public class ExemploParticoPoo {

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.abrirConta("poupanca");
        conta.depositar(180.0f);
        conta.sacar(75.6f);
        System.out.println(conta.toString());
    }
    
}
