package DESAFIO_COMBATE;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite os dados do primeiro Campeão: ");

		System.out.print("Digite o Nome: ");
		String name_1 = sc.nextLine();

		System.out.print("Qual o valor da vida: ");
		int life_1 = sc.nextInt();

		System.out.print("Qual ataque: ");
		int attack_1 = sc.nextInt();

		System.out.print("Qual armadura: ");
		int armor_1 = sc.nextInt();

		Champion champion1 = new Champion(name_1,life_1, attack_1, armor_1);

		System.out.println("Digite os dados do segundo Campeão: ");

		System.out.print("Digite o nome: ");
		String name_2 = sc.next();

		System.out.print("Qual o valor da vida: ");
		int life_2 = sc.nextInt();

		System.out.print("Qual ataque: ");
		int attack_2 = sc.nextInt();

		System.out.print("Qual armadura: ");
		int armor_2 = sc.nextInt();

		Champion champion2 = new Champion(name_2, life_2, attack_2, armor_2);

		System.out.print("Digite o número de turnos: ");
		int n = sc.nextInt();

		System.out.println("------------------------------------------");

		System.out.println("Iniciando batalha entre");
		System.out.println("Oponente 1 => " + champion1.Status());
		System.out.println("Oponente 2 => " + champion2.Status());
		System.out.println("Numero de Turnos => " + n);

		System.out.println("------------------------------------------");

		for (int i = 1; i <= n; i++) {

			champion1.battle(champion2);
			champion2.battle(champion1);

			System.out.println("------------------------------------------");
			System.out.println("Batalha turno => " + i);
			System.out.println("Oponente 1 => " + champion1.Status());
			System.out.println("Oponente 2 => " + champion2.Status());

			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {

				break;
			}

		}
		System.out.println("FIM DO COMBATE");
		sc.close();

	}

}
