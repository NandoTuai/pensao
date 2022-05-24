package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Pensao.Pensao;

public class APP {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int posicao;
		System.out.println("quais sao os quartos a ser alugados");
		int n = entrada.nextInt();
		Pensao [] vect= new Pensao [10];
		for(int i=0; i<n;i++) {
			entrada.nextLine();	
			System.out.println("Digite o seu nome");
			String nome=entrada.nextLine();
			System.out.println("Digite o seu email");
			String email=entrada.nextLine();
			System.out.println("Digite o seu numero de quarto");
			int numerQuarto=entrada.nextInt();
			vect[i] = new Pensao(numerQuarto, nome,email,numerQuarto);
		} 
		posicao=0;
		while (posicao<n) {
			
			System.out.println(vect[posicao]);
			posicao++;
		}
		/*for (posicao=0;posicao<vect.length;posicao++) {
			
			System.out.print(vect[posicao]);
			
		}*/
		entrada.close();
		
	}
}

