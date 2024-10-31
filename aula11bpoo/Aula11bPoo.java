package aula11bpoo;

public class Aula11bPoo {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("Ricardo", 12, "M"); // Não é possivel pois pessoa é objeto abstrato
        Aluno a = new Aluno(1234124, "Matematica", "Valencio", 87, "M" );
        Bolsista b = new Bolsista(112343, 43423, "Engenharia", "Olavo", 34, "M");
        
        //Pessoa p2 = new Pessoa();
        Bolsista b2 = new Bolsista();
        Aluno a2 = new Aluno();
        
        //System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        
       // System.out.println("\n"+p2.toString());
        System.out.println("\n"+a2.toString());
        System.out.println(b2.toString());
    }
}
