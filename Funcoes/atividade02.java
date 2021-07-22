import javax.swing.JOptionPane;

public class atividade02 {

	static String[] nome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nome = new String[3];

		for (int i = 0; i < nome.length; i++) {

			nome[i] = JOptionPane.showInputDialog("Digite seu nome.");

		}

		verificaVogal(nome);

	}

	private static void verificaVogal(String[] nome2) {
		// TODO Auto-generated method stub
		int contVogais = 0, contConsoantes = 0;

		for (int i = 0; i < nome2.length; i++) {

			switch (nome[i].charAt(0)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contVogais++;
				break;
			default:
				contConsoantes++;
				break;
			}

		}

		System.out
				.println("Quantidade de consoantes: " + contConsoantes + " " + "\nQuantidade de vogais: " + contVogais);

	}

}
