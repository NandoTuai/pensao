package Pensao;

public class Pensao {
		
		private String nome;
		private String email;
		private int numerQuarto;
		public Pensao(int numero, String nome, String email, int numeroQuarto) {
			this.nome = nome;
			this.email = email;
			this.numerQuarto = numeroQuarto;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getNumeroQuato() {
			return numerQuarto;
		}
		public void setNumeroQuarto(int numeroQuarto) {
			this.numerQuarto = numeroQuarto;
		}
		@Override
		public String toString() {
			return "\n Nr do Quarto " + numerQuarto 
					+ "\nnome: " + nome
					+"\nemail: " + email;
		}
		
	}
	
	

