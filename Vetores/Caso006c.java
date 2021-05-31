import javax.swing.JOptionPane;

/**
 * 
 * Faça um Programa que leia dois vetores com 10 elementos cada. Gere um
 * terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos
 * elementos intercalados dos dois outros vetores.
 *
 */

/*
 * Foi de arrancar cabelo.
 */

public class Caso006c {

	static int[] vetor1, vetor2, vetor3;
	static int aux1, aux2;

	public static void main(String[] args) {

		vetor1 = new int[10];
		vetor2 = new int[vetor1.length];
		vetor3 = new int[vetor1.length + vetor1.length];

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 1 posição: " + i));
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 2 posição: " + i));

			if (i == (vetor1.length - 1)) {
				for (int j = 0; j < vetor3.length; j++) {
					if (j % 2 == 0) {
						vetor3[j] = vetor1[aux1];
						System.out.println("Vetor3 recebeu: " + vetor3[j] + " do Vetor1");
						aux1++;
					}

					if (j % 2 == 1) {
						vetor3[j] = vetor2[aux2];
						System.out.println("Vetor3 recebeu: " + vetor3[j] + " do Vetor2");
						aux2++;
					}
				}
			}

		}

	}
}
