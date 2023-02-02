package pilha_numerica;

import java.util.Scanner;

public class Interacao_Pilha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pilha pilha = new Pilha();

		int opc = 0;

		while (opc != 5) {

			System.out.println("");
			System.out.println("Pilha numérica");
			System.out.println("");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Pesquisar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Sair");
			System.out.println("");
			System.out.print("Digite a opção desejada: ");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				pilha.inserir();
				break;

			case 2:
				pilha.listar();
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
		sc.close();
	}
}
