package atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.print("1- Quadrado\n2- Circulo\n3- Sair\nVALOR:");
		int valor = leia.nextInt();
		switch(valor){
			case 1: 
				System.out.println("\n\tcriar um quadrado: ");
				System.out.print("Informe o valor de um lado: ");
				int lado = leia.nextInt();
				leia.nextLine();
				System.out.print("Informe a cor do quadrado: ");
				String cor = leia.nextLine();		
				System.out.print("Informe o valor da espessura da borda: ");
				double espessura = leia.nextDouble();
				leia.nextLine();
				System.out.print("Informe a cor da borda do quadrado: ");		
				String corDaBorda = leia.nextLine();
				
				Quadrado quadrado = new Quadrado(lado, cor, corDaBorda, espessura);
				quadrado.toString();
				break;
			case 2:
				System.out.println("\n\tcriar um circulo: ");
				System.out.print("Informe o valor do raio: ");
				int raio = leia.nextInt();
				leia.nextLine();
				System.out.print("Informe a cor do circulo: ");
				String cor1 = leia.nextLine();		
				System.out.print("Informe o valor da espessura da borda: ");
				double espessura1 = leia.nextDouble();
				leia.nextLine();
				System.out.print("Informe a cor da borda do circulo: ");		
				String corDaBorda1 = leia.nextLine();
				
				Circulo circulo = new Circulo(raio, cor1, corDaBorda1, espessura1);
				circulo.toString();
				break;
			case 3: 
				break;
			default: 
				System.out.println("Opcao invalida");
				break;
		}
		
		
		
	}

}
