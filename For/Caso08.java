import javax.swing.JOptionPane;

public class Caso08 {

	static int imp;

	public static void main(String[] args) {

		// imp = Integer.parseInt(JOptionPane.showInputDialog(Di));

		for (int i = 0; i <= 500; i++) {

			if (i % 2 == 1) {

				imp += i;

				System.out.println(imp);
			}

		}

		JOptionPane.showMessageDialog(null, "A soma de todos os numeros impares, seria: " + imp);
	}
}
