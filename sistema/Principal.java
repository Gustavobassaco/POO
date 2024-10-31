package sistema;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	public static void main( String [ ] args ) {
		Scanner entrada = new Scanner(System.in);
		boolean reconhecido = false;
		
		int escolha = 1;
		String aux1, aux2;
		ArrayList<SistemaAcademico> lista = new ArrayList<>();
		
		System.out.println("Cadastre o primeiro usuario (administrador): ");
		
		System.out.println("Digite email: ");
                clearBuffer(entrada);
		aux1 = entrada.nextLine();
		System.out.println("Digite a senha: ");
                clearBuffer(entrada);
		aux2 = entrada.nextLine();
		
		SistemaAcademico sistema = new SistemaAcademico(aux1, aux2);
		lista.add(sistema);
		
		do {	
				System.out.println("\n--------------------------------------------------");
				System.out.println("Digite email e senha de um usuario ja cadastrado:");
				System.out.println("Digite email: ");
                                clearBuffer(entrada);
				aux1 = entrada.nextLine();
				System.out.println("Digite a senha: ");
                                clearBuffer(entrada);
                                aux2 = entrada.nextLine();
				
                    for ( SistemaAcademico c : lista ){

			if(sistema.getAcesso(aux1, aux2)) {
                            reconhecido = true;
			
                            System.out.println("----------Menu--------------");
                            System.out.println("Escolha uma das opções: ");
                            System.out.println("----------------------------");
                            System.out.println("0-Encerra o programa");
                            System.out.println("1-cadastro do aluno");
                            System.out.println("2-Exibir media de m aluno");
                            System.out.println("3-Exibir notas de um aluno");
                            System.out.println("4-Exibir displina matriculada do aluno");
                            System.out.println("5-Exibir todos os alunos");
                            System.out.println("---------------------------");
                            clearBuffer(entrada);
                            escolha = entrada.nextInt();
                            System.out.println("---------------------------");

	        
                            switch(escolha) {
                                case 0:
                                        break;
                                case 1:
                                    System.out.println("-------Cadastre do usuario--------");
                                    System.out.println("Digite o email: ");
                                    clearBuffer(entrada);
                                    aux1 = entrada.nextLine();
                                    clearBuffer(entrada);
                                    
                                    System.out.println("Digite a senha: ");
                                    aux2 = entrada.nextLine();
                                    clearBuffer(entrada);

                                    sistema.cadastrar(aux1, aux2);
                                    lista.add(sistema);
                                    break;

                                case 2:
                                    System.out.println("A media do aluno é: " + c.getMedia() + "\n");
                                    break;

                                case 3:
                                    System.out.println("Nota 1: "+ c.getNota1() + "\nNota 2: "+ c.getNota2()+"\n");
                                    break;

                                case 4:
                                    System.out.println("Disciplina do aluno: " + c.getDisciplina() + "\n");
                                    break;

                                case 5:
                                    
                                        System.out.println(lista.toString());
                                    

                                default: break;

                            }//switch
                            break;
                        } //if
                    }//for
				if(reconhecido == true) {
					reconhecido = false;
				}else {
					System.out.println("usuario não reconhecido");
				}
		} while(escolha != 0);

	}

}
