import javax.swing.JOptionPane;

public class caso03ee {

	static String[] nomes;
	static int quantidadeVogal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite seu nome");
		}

		quantidadeVogal = verificaNome(nomes);

		System.out.println("Quantidade de nomes que" + " começam com vogais: " + quantidadeVogal);

	}

	private static int verificaNome(String[] nomes2) {
		// TODO Auto-generated method stub

		int cont = 0;
		for (int i = 0; i < nomes2.length; i++) {

			if (nomes2[i].charAt(0) == 'a' || nomes2[i].charAt(0) == 'e' || nomes2[i].charAt(0) == 'i'
					|| nomes2[i].charAt(0) == 'o' || nomes2[i].charAt(0) == 'u') {

				cont++;
			}
		}

		return cont;
	}

}
