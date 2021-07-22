import javax.swing.JOptionPane;

public class atividade03 {

	static String[] cidades;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cidades = new String[3];

		for (int i = 0; i < cidades.length; i++) {

			cidades[i] = JOptionPane.showInputDialog("Digite o "
					+ "nome da cidade").toLowerCase();
		}

		contaVogaisConsoantes(cidades);

	}

	private static void contaVogaisConsoantes(String[] cidades2) {
		// TODO Auto-generated method stub

		char[] vetorCidade;
		int contVogal = 0;
		for (int i = 0; i < cidades2.length; i++) {

			vetorCidade = cidades2[i].toCharArray();

			for (int j = 0; j < vetorCidade.length; j++) {

				switch (vetorCidade[j]) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contVogal++;
					break;
				default:
					break;
				}

			}

			System.out.println(cidades2[i] + " tem " + contVogal + " vogais. \n");
			contVogal = 0;

		}

	}

}
