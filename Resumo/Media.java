import javax.swing.JOptionPane;

public class Media {

	static double result;
	static double[] nota;

	public static void main(String[] args) {

		nota = new double[3];

		for (int i = 0; i < 3; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

			result += nota[i];

			if (i == 2) {

				result = result / 3;
				if (result >= 7) {
					JOptionPane.showMessageDialog(null, "A media da nota é: " + result + " APROVADO");
				} else {
					JOptionPane.showMessageDialog(null, "A media da nota é: " + result + " REPROVADO");
				}

			}

		}

	}

}
