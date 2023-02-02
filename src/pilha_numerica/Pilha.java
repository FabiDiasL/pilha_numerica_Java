package pilha_numerica;

import java.util.Scanner;

public class Pilha {

	Scanner sc = new Scanner(System.in);

	int vPilha[] = new int[50];
	int qtd = 0;

	public Pilha() {
		this.vPilha = vPilha;
		this.qtd = 0;
	}

	void inserir() {
		int valor;
		if (!pilhaCheia()) {
			System.out.print("Digite o número que deseja inserir na pilha numérica: ");
			valor = sc.nextInt();
			vPilha[qtd] = valor;
			qtd++;
			System.out.println("Número " +valor+" inserido com sucesso!");
		}
	}

	void listar() {
		if (!pilhaVazia()) {
			for (int i = 0; i < qtd; i++) {
				System.out.println((i + 1) + "º elemento: " + vPilha[i]);
			}
		}
	}

	private boolean pilhaCheia() {
		if (qtd == vPilha.length) {
			System.out.println("A pilha está cheia!");
			return true;
		}
		return false;
	}

	private boolean pilhaVazia() {
		if (qtd == 0) {
			System.out.println("A pilha está vazia!");
			return true;
		} else {
			return false;
		}
	}
}
