import javax.swing.JOptionPane;

/**
 * 
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
 * primeiro número elevado ao segundo número.
 *
 */

public class Caso9 {

	static int expoente, base, result, cont = 1;

	public static void main(String[] args) {
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Base"));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Expoente"));

		while (cont <= expoente) {

			//System.out.println(result);
			JOptionPane.showMessageDialog(null, result);
			result += base * base;

			cont++;
		}

		 
	}

}
