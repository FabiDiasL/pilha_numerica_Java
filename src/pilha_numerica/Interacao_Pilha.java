package pilha_numerica;

import java.util.Scanner;

public class Interacao_Pilha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pilha pilha = new Pilha();
		
		int opc = 0;
		
		while(opc != 5) {
			
		
		System.out.println("");
		System.out.print("1 - Inserir");
		System.out.print("2 - Listar");
		System.out.print("3 - Pesquisar");
		System.out.print("4 - Excluir");
		System.out.print("5 - Sair");
		System.out.println("");
		System.out.print("Escolha uma opção: ");
		opc = sc.nextInt();
		
		switch (opc){
		
		case 1:
			//inserir();
			break;
			
		case 2:
			break;
			
		case 3:
			break;
		
		case 4:
			break;
		
		case 5:
			System.out.println("Finalizado com sucesso!");
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
		
		}

	}

	

}
