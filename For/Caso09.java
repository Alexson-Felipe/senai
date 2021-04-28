import javax.swing.JOptionPane;

public class Caso09 {

	static int numeroPositivoNegativo;

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			numeroPositivoNegativo = Integer
					.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou negativo"));

			if (numeroPositivoNegativo > 0) {

				JOptionPane.showMessageDialog(null, numeroPositivoNegativo + " Valor positivo");

			}

		}

	}

}
