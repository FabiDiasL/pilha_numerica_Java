package pilha_numerica;

import java.util.Scanner;

public class Pilha {

	Scanner sc = new Scanner(System.in);

	private float vPilha[] = new float[5];
	private int qtd = 0;

	void inserir() {
		float valor;
		if (!pilhaCheia()) {
			System.out.print("Digite o número que deseja inserir na pilha numérica: ");
			valor = sc.nextFloat();
			vPilha[qtd] = valor;
			qtd++;
			System.out.println("Número " + valor + " inserido na pilha com sucesso!");
		}
	}

	void listar() {
		if (!pilhaVazia()) {
			for (int i = 0; i < qtd; i++) {
				System.out.println((i + 1) + "º elemento: " + vPilha[i]);
			}
		}
	}

	void pesquisar() {
		float valor;
		boolean achei = false;
		if (!pilhaVazia()) {
			System.out.println("Digite o número que deseja pesquisar: ");
			valor = sc.nextFloat();
			for (int i = 0; i < qtd && achei == false; i++) {
				if (valor == vPilha[i]) {
					System.out.println("Número encontrado na " + (i + 1) + "ª posição da pilha.");
					achei = true;
				}
			}
			if (achei == false) {
				System.out.println("Número não encontrado na pilha!");
			}
		}
	}

	void excluir() {
		if (!pilhaVazia()) {
			System.out.println("Número " + vPilha[qtd - 1] + " excluído da pilha com sucesso. ");
			qtd--;
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
