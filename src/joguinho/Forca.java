package joguinho;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Forca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Test");
		System.out.println("                  JOGO DA FORCA");

		System.out.print("Digite uma palavra: ");
		String palavraSecreta = sc.nextLine();
		char array[] = palavraSecreta.toCharArray();

		System.out.println();

		char arrayTraco[] = new char[array.length];
		
		Set<Character> letrasDigitadas = new TreeSet<>();

		for (int i = 0; i < arrayTraco.length; i++) {
			arrayTraco[i] = '-';
		}

		for (char c : arrayTraco) {
			System.out.print(c);
		}

		int chances = 6;
		while (chances > 0) {

			for (int i = 0; i < 100; i++) {
				System.out.println("");
			}
			
			String letras = "";
			for (Character ch : letrasDigitadas) {
				letras += " " + ch;
			}
			System.out.println("\nLetras Digitadas: " + letras);

			if (chances == 6) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|     /|\\");
				System.out.println("|      |");
				System.out.println("|     / \\");
				System.out.println("|");
			} else if (chances == 5) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|     /|\\");
				System.out.println("|      |");
				System.out.println("|     / ");
				System.out.println("|");
			} else if (chances == 4) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|     /|\\");
				System.out.println("|      |");
				System.out.println("|      ");
				System.out.println("|");
			} else if (chances == 3) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|     / \\");
				System.out.println("|      ");
				System.out.println("|      ");
				System.out.println("|");
			} else if (chances == 2) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|     / ");
				System.out.println("|      ");
				System.out.println("|      ");
				System.out.println("|");
			} else if (chances == 1) {
				System.out.println("_________");
				System.out.println("|      O");
				System.out.println("|      ");
				System.out.println("|      ");
				System.out.println("|      ");
				System.out.println("|");
			}

			for (char c : arrayTraco) {
				System.out.print(c);
			}
			
			System.out.print("       Suas chances: " + chances + " | Uma letra: ");
			char letter = sc.next().charAt(0);
			letrasDigitadas.add(Character.valueOf(letter));
			
			
			
			int cont1 = 0;
			for (int i = 0; i < array.length; i++) {
				if (letter == array[i]) {
					arrayTraco[i] = letter;
					cont1++;
				}
			}
			if (cont1 == 0) {
				chances--;
			}

			int cont = 0;
			for (int i = 0; i < arrayTraco.length; i++) {
				if (arrayTraco[i] != '-') {
					cont++;
				}
			}

			if (cont == array.length) {
				for (char c : arrayTraco) {
					System.out.print(c);
				}
				System.out.println("\nVocê ganhou =)");
				break;
			}
		}

		if (chances == 0) {

			System.out.println("\n\n_________");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|");

			System.out.println("Você perdeu =/");
		}

		sc.close();

	}

}
