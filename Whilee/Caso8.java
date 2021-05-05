import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
 * tabuada. A saída deve ser conforme o exemplo abaixo: Tabuada de 5: 5 X 1 = 5
 * 5 X 2 = 10 ... 5 X 10 = 50
 *
 */
public class Caso8 {

	static int valorTab, calc = 1;

	public static void main(String[] args) {

		valorTab = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero, para calcular a tabuada"));

		while (calc <= 10) {

			JOptionPane.showMessageDialog(null,
					(valorTab + " x " + "1 = " + valorTab * 1) + (valorTab + " x " + "2 = " + valorTab * 2)
							+ (valorTab + " x " + "3 = " + valorTab * 3) + (valorTab + " x " + "4 = " + valorTab * 4) + (valorTab + " x " + "5 = " + valorTab * 5));

		}

	}

}
