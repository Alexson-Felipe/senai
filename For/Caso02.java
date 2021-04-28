import javax.swing.JOptionPane;

public class Caso02 {

	static int numero;
	static double resultado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

		for (int i = 0; i <= numero; i++) {

			resultado = i % 2;

			if (resultado == 0) {
				JOptionPane.showMessageDialog(null, "Numero Par: " + i);
			}

		}

	}

}
