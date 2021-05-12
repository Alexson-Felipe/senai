import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que exiba quantas pessoas possuem mais de 18 anos. 
 * O algoritmo deverá ler a idade de 10 pessoas.
 */

public class Caso05b {

	static int cont, idade, dMaior;

	public static void main(String[] args) {

		do {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

			
			if (idade >= 18) {
				dMaior++;
			}

			cont++;

		} while (cont <= 10);
		JOptionPane.showMessageDialog(null, "Numero de pessoas, maior que 18 anos: " + dMaior);

	}

}
