import javax.swing.JOptionPane;

public class Caso04d {

	static int[][] matriz;

	public static void main(String[] args) {

		matriz = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				matriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o valor para matriz posição: " + i));

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matriz[i][j] % 2 == 0) {
					System.out.println(
							"O valor " + matriz[i][j] + " digita na linha " + i + " e coluna " + j + " é par.");
				}
			}
		}

	}

}
