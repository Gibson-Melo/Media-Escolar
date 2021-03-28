package aplicacao;

import entidades.Medias;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Medias med = new Medias();
		String resultado;

		System.out.println("========= MÉDIA  SEMESTRAL =========");
		System.out.println("____________________________________");
		System.out.print("Digite a Nota da 1° Prova do Aluno: ");
		med.setP1(sc.nextDouble());
		System.out.print("Digite a Nota da 2° Prova do Aluno: ");
		med.setP2(sc.nextDouble());
		med.mediaSemestral();
		System.out.println("____________________________________");
		resultado = med.mediaSemestral();
		System.out.println(resultado);
		if (med.getMed1() >= 2.0 && med.getMed1() < 7.0) {
			System.out.println("\n=========== MÉDIA  FINAL ===========");
			System.out.println("____________________________________");
			System.out.print("Digite a Nota da 3° Prova do Aluno: ");
			med.setP3(sc.nextDouble());
			System.out.println("____________________________________");
			med.mediaFinal();
			resultado = med.mediaFinal();
			System.out.println(resultado);
			System.out.println("____________________________________");

		}

		sc.close();

	}

}
