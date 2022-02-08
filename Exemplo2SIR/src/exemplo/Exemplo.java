package exemplo;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int[] vetor = new int[5]; //variável local
		preencher(vetor); //argumento do metodo --> variavel que sera enviada
		int maior = maiorValor(vetor);
		int menor = menorValor(vetor);
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
		
	}
	
	public static int maiorValor(int[] vetor) {
		int aux = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > aux) {
				aux = vetor[i];
			}
		}
		return aux;
	}
	
	public static int menorValor(int[] vetor) {
		int aux = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] < aux) {
				aux = vetor[i];
			}
		}
		return aux;
	}
	
	public static void preencher(int[] vetor) {//Vetor é parametro do metodo -> o que vai receber
	Scanner entrada = new Scanner(System.in);
	for(int i = 0; i < vetor.length; i++) {
		System.out.println("Valor: ");
		vetor[i] = entrada.nextInt();
	}
	entrada.close();
}
}
