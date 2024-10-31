package sistema;
import java.util.Scanner;

public class SistemaAcademico {
	Scanner entrada = new Scanner(System.in);
	private String nome;
	private float nota1, nota2;
	private String disciplina;
	
	Validador v = new Validador();
	public SistemaAcademico(String email,  String senha) {
	
		v.cadastro_email(email);
		v.cadastro_senha(senha);
		
		System.out.println("Digite o seu nome: ");
		this.nome = entrada.nextLine();
		
		System.out.println("Digite o sua disciplina: ");
		this.disciplina = entrada.nextLine();
		
		System.out.println("Digite a nota 1: ");
		this.nota1 = entrada.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		this.nota2 = entrada.nextFloat();
	}
	
	public void cadastrar(String email,  String senha) {
		
		v.cadastro_email(email);
		v.cadastro_senha(senha);
		
		System.out.println("Digite o seu nome: ");
                entrada.nextLine();
		this.nome = entrada.nextLine();
		
		System.out.println("Digite o sua disciplina: ");
                entrada.nextLine();
		this.disciplina = entrada.nextLine();
		
		System.out.println("Digite a nota 1: ");
                entrada.nextLine();
		this.nota1 = entrada.nextFloat();
		
		System.out.println("Digite a nota 2: ");
                entrada.nextLine();
		this.nota2 = entrada.nextFloat();
	}
	
	public float getMedia() {
		return (this.nota1 + this.nota2)/2;
	}
	
	public boolean getAcesso(String email, String senha) {
		if(v.getEmail().equals(email) && v.getSenha().equals(senha)) {
			return true;
		}
		else { 
		return false;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNota1(float nota) {
		this.nota1 = nota;
	}
	
	public void setNota2(float nota) {
		this.nota2 = nota;
	}
	
	
	public String getDisciplina() {
		return this.disciplina;
		
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public float getNota1() {
		return this.nota1;
	}
	
	public float getNota2() {
		return this.nota2;
	}
	
	public String toString() {
		return "nome: " + this.nome+ "\nemail: "+ v.getEmail() + "\nSenha: "+ v.getSenha() +
				"\nDisciplina: "+this.disciplina + "\nNota 1: " + this.nota1+ "\nNota 2: " + this.nota2;
	}

	
}
