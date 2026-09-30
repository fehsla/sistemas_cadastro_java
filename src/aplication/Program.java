package aplication;

import java.util.Scanner;
import entities.Cliente;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Cliente> clientes = new ArrayList<>();

		System.out.println("=====CADASTRO DE CLIENTES=====");
		System.out.println("1 - CADASTRAR CLIENTE");
		System.out.println("2 - LISTAR CLIENTE");
		System.out.println("3 - BUSCAR CLIENTE");
		System.out.println("4 - REMOVER CLIENTE");
		System.out.println("5 - ALTERAR DADOS CLIENTE");
		System.out.println("6 - SAIR");

		int escolha = sc.nextInt();
		int busca;

		while (escolha != 6) {

			if (escolha == 1) {
				Cliente cliente = new Cliente();

				System.out.printf("INFORME O ID: ");
				cliente.id = sc.nextInt();
				sc.nextLine();

				System.out.printf("INFORME O NOME: ");
				cliente.nome = sc.nextLine();

				System.out.printf("INFORME O EMAIL: ");
				cliente.email = sc.nextLine();

				System.out.printf("INFORME O TELEFONE: ");
				cliente.telefone = sc.nextLine();

				// FUNCAO ARRAY
				clientes.add(cliente);

			} else if (escolha == 2) {

				System.out.println("====CLIENTES CADASTRADOS====");

				for (Cliente cliente : clientes) {

					System.out.println(cliente.id);
					System.out.println(cliente.nome);
					System.out.println(cliente.email);
					System.out.println(cliente.telefone);

				}
			} else if (escolha == 3) {
				System.out.println("====BUSCA DE CLIENTES====");
				System.out.println("INSIRA O ID: ");
				boolean encontrado = false;
				busca = sc.nextInt();
				sc.nextLine();

				for (Cliente cliente : clientes) {
					if (busca == cliente.id) {
						encontrado = true;
						System.out.println("====CLIENTE ENCONTRADO====");
						System.out.println(cliente.id);
						System.out.println(cliente.nome);
						System.out.println(cliente.email);
						System.out.println(cliente.telefone);
					}
				}

				if (!encontrado) {
					System.out.println("CLIENTE NAO ENCONTRADO");
				}
				
			} else if (escolha == 4) {
				System.out.println("====REMOÇÃO DE CLIENTES====");
				System.out.println("INSIRA O ID");
				busca = sc.nextInt();
				boolean encontrado = false;

				sc.nextLine();

				for (int i = 0; i < clientes.size(); i++) {
					if (busca == clientes.get(i).id) {
						System.out.println("CLIENTE REMOVIDO");
						encontrado = true;
						clientes.remove(i);
						break;
					}
				}
				if (!encontrado) {
					System.out.println("CLIENTE NAO ENCONTRADO");
				}
			} else if (escolha == 5) {
				System.out.println("====ALTERACAO DE CLIENTES====");
				System.out.println("INSIRA O ID: ");
				busca = sc.nextInt();
				boolean encontrado = false;

				sc.nextLine();

				for (int i = 0; i < clientes.size(); i++) {
					if (busca == clientes.get(i).id) {
						System.out.println("CLIENTE ENCONTRADO - ALTERACAO DE DADOS");
						System.out.println("INSIRA OS DADOS ATUALIZADOS");
						encontrado = true;

						System.out.println("INSIRA O NOVO NOME");
						clientes.get(i).nome = sc.nextLine();

						System.out.println("INSIRA O NOVO EMAIL");
						clientes.get(i).email = sc.nextLine();

						System.out.println("INSIRA O NOVO TELEFONE");
						clientes.get(i).telefone = sc.nextLine();

						break;
					}
				}
				if (!encontrado) {
					System.out.println("CLIENTE NAO ENCONTRADO");
				}
			}

			System.out.println("=====CADASTRO DE CLIENTES=====");
			System.out.println("1 - CADASTRAR CLIENTE");
			System.out.println("2 - LISTAR CLIENTE");
			System.out.println("3 - BUSCAR CLIENTE");
			System.out.println("4 - REMOVER CLIENTE");
			System.out.println("5 - ALTERAR DADOS CLIENTE");
			System.out.println("6 - SAIR");

			escolha = sc.nextInt();

		}
		sc.close();

	}
}
