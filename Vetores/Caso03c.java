import javax.swing.JOptionPane;

public class Caso03c {

	static int quantidadeIdades, somaIdades;
	static int[] idades;
	static double mediaIdades;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quantidadeIdades = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de idades que vocês deseja informar"));

		idades = new int[quantidadeIdades];

		for (int i = 0; i < quantidadeIdades; i++) {

			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idades"));

		}

		for (int i = 0; i < quantidadeIdades; i++) {
			JOptionPane.showMessageDialog(null, idades[i]);

			somaIdades += idades[i];

		}

		mediaIdades = somaIdades / quantidadeIdades;
		JOptionPane.showMessageDialog(null, "Média das idades informadas: " + mediaIdades);

	}

}
