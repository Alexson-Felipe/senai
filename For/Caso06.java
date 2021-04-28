
import javax.swing.JOptionPane;

public class Caso06 {

	static int n, valor, media1;

	public static void main(String[] args) {

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de alunos"));

		for (int i = 1; i <= n; i++) {

			media1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a media do " + i + " aluno"));
			valor += media1;

		}

		double media = valor / n;
		JOptionPane.showMessageDialog(null, media);

	}

}
