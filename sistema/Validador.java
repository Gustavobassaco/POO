package sistema;
public class Validador {
	private String email;
	private String senha;

	
		
		public void cadastro_email(String email) {
			this.email = email;		
		}
		
		public void cadastro_senha(String senha) {
			this.senha = senha;	
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public String getSenha() {
			return this.senha;
		}

}
