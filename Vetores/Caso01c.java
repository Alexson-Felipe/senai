import javax.swing.JOptionPane;

public class Caso01c {

	static int[] numero;
	static int numeroNegativo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numero = new int[6];

		for (int i = 0; i < numero.length; i++) {

			numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + "um numero inteiro"));

		}

		for (int i = 0; i < 6; i++) {

			JOptionPane.showMessageDialog(null, "Numero na posição "
					+ "" + "" + i + ": " + "" + numero[i]);

			if (numero[i] < 0) {

				numeroNegativo++;
			}

		}
		JOptionPane.showMessageDialog(null, "Quantidade de numeros negativos:  "
				+ ""+numeroNegativo);

	}

}
