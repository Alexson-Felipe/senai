import javax.swing.JOptionPane;

/**
 * 
 * Faça um programa que, dado um conjunto de N números, determine o menor valor,
 * o maior valor e a soma dos valores.
 *
 */

public class Caso10b {

	static int valor, somaValor, n, menorValor, maiorValor, cont = 1;

	public static void main(String[] args) {

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de repetições"));

		while (cont <= n) {
			
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + cont + "º " + " valor"));

			if(cont == 1) {
				menorValor = valor;
			}
			
			if (valor < menorValor) {
				menorValor = valor;
			}

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			somaValor += valor;

			cont++;

		}

		JOptionPane.showMessageDialog(null, "A Soma de todos o valor é: " + somaValor + "\nO valor maior é: "
				+ maiorValor + "\nO valor menor é: " + menorValor);

	}

}
