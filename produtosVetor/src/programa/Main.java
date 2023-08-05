package programa;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira quantos produtos deseja cadastrar: ");
		int n = sc.nextInt();
		sc.nextLine();
				
		Produto[] vetor = new Produto[n];
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.printf("\nNome do %d° produto: ", i + 1);
			String nome = sc.nextLine();
			System.out.printf("\nDigite o preço do %s: ", nome);
			Double preco = sc.nextDouble();
			sc.nextLine();
			vetor[i] = new Produto(nome, preco);
			}

		
		System.out.println("\nLista de Produtos");
		Double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].toString());
			soma += vetor[i].getPreco();
		}
		
		Double media = soma / vetor.length;
		System.out.printf("\nMédia do preços dos produtos: %.2f", media);
		
		sc.close();
	}

}
