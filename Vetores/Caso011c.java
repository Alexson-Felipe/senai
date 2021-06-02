import javax.swing.JOptionPane;

/**
 * 
 * Escreva um programa que leia 10 números inteiros no intervalo [0,50], caso
 * seja digitado um valor fora desse intervalo uma mensagem deve ser informada
 * ao usuário. Posteriormente informe a soma dos números do intervalo de [0,50]
 * e mostre o total de números que foram digitados fora desse intervalo.
 *
 */


//falta terminar
public class Caso011c {

	static int[] intervalo;

	public static void main(String[] args) {

		intervalo = new int[10];

		for (int i = 0; i < intervalo.length; i++) {

			intervalo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 0, 50  " +" Posição " + i));

			if (i == intervalo.length - 1) {
				for (int j = 0; j < intervalo.length; j++) {
					if (intervalo[j] >= 0 && intervalo[j] <= 50) {
						System.out.println("O Valor: " + intervalo[j] + " está entre dentro de <0, 50>");
					} else {
						System.out.println("O Valor: " + intervalo[j] + " não fora de <0, 50>");
					}

				}

			}
		}

	}

}
