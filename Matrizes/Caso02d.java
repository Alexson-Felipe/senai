import javax.swing.JOptionPane;

public class Caso02d {

	static int[][] matrizColuna;
	static int soma;

	public static void main(String[] args) {

		matrizColuna = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				matrizColuna[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a matriz"));

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				soma += matrizColuna[i][j];

			}

			System.out.println("Linha " + i + " : " + soma);
			soma = 0;
		}
	}

}
