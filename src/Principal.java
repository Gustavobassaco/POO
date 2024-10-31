import java.util.Scanner;

public class Principal {

	public Principal() {
		Scanner entrada = new Scanner(System.in);
		int escolha;
		String aux1, aux2;
		
		System.out.println("Cadastre o primeiro usuario: ");
		System.out.println("Digite email: ");
		aux1 = entrada.nextLine();
		System.out.println("Cadastre o primeiro usuario: ");
		aux2 = entrada.nextLine();
		SistemaAcademico sistema = new SistemaAcademico(aux1, aux2);
		


		
		do {
			
			
			System.out.println("----------Menu--------------");
			System.out.println("Escolha uma das opções: ");
	        Scanner entrada = new Scanner(System.in);
	        
	        escolha = entrada.nextInt();
	        System.out.println("----------------------------");
	        System.out.println("0-Encerra o programa");
	        System.out.println("1-cadastro do aluno");
	        System.out.println("2-Exibir media de m aluno");
	        System.out.println("3-Exibir notas de um aluno");
	        System.out.println("4-Exibir displina matriculada do aluno");
	        System.out.println("-------------------");
	        
	        switch(escolha) {
	        case 1:
	        	System.out.println("Cadastre o primeiro usuario: ");
	    		System.out.println("Digite email: ");
	    		aux1 = entrada.nextLine();
	    		System.out.println("Cadastre o primeiro usuario: ");
	    		aux2 = entrada.nextLine();
	    		SistemaAcademico sistema = new SistemaAcademico(aux1, aux2);
	    		break;
	    		
	        case 2:
	        	System.out.println("A media do aluno é: "+ getMedia()+ "\n");
	        	break;
	        	
	        case 3:
	        	System.out.println("Nota 1: "+ getNota1() + "\nNota 2: "+ getNota2()+"\n");
	        	break;
	        	
	        case 4:
	        	System.out.println("Disciplina do aluno: " + getDisciplina() + "\n");
	        
	        }
				
		}while(escolha == 0);
		
		
	}

}
