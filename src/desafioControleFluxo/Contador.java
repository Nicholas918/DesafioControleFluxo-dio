package desafioControleFluxo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
	
	public static void main(String[] args) {
		
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parametro...");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parametro...");
			int parametroDois = terminal.nextInt();
			terminal.close();
			
			try {
				contar(parametroUm, parametroDois);
			} 
			catch (ParametrosInvalidosException e) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			} 
			
		}
		catch (InputMismatchException e) {
			System.out.println("Os parametros devem ser numericos!");
		}
		
	}
	
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
	
}
