package exerciciopraticopoo2;

public class ExercicioPraticoPoo2 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 34, "masculino");
        p[1] = new Pessoa("Carlos", 67, "masculino");
        
        l[0] = new Livro("Alice no pais das maravilhas", "JKisr", 359, p[0]);
        l[1] = new Livro("Persie Jackson", "Lutor", 233, p[0]);
        l[2] = new Livro("HArry Potter", "JKRolling", 764, p[1]);
        
        System.out.println("Detalhes Livro 1:\n" + l[0].toString()+"\n\nDetalhes Livro 2:\n"+
               l[1].toString()+ "\n\nDetalhes Livro 3: \n" + l[2].toString());
        
        l[0].abrir();
        l[1].abrir();
        l[0].folear(56);
        l[1].avancarPag();
        
         System.out.println("Detalhes Livro 1:\n" + l[0].toString()+"\n\nDetalhes Livro 2:\n"+
               l[1].toString()+ "\n\nDetalhes Livro 3: \n" + l[2].toString());
    }
    
}
