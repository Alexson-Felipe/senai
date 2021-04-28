import javax.swing.JOptionPane;

public class Caso07 {

	static int x, y;

	public static void main(String[] args) {

		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));

		for (int i = 2; i <= 20; i++) {

			y += x + i;

		}

		JOptionPane.showMessageDialog(null, y);

	}

}
