import javax.swing.JOptionPane;

public class caso02ee {

	static String nomeCompleto;
	static String[] primeiroNome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo.");

		primeiroNome = separaNome(nomeCompleto);

		System.out.println(primeiroNome[1]);

	}

	private static String[] separaNome(String nomeCompleto2) {
		// TODO Auto-generated method stub

		String[] vetorNome;

		vetorNome = nomeCompleto2.split(" ");

		return vetorNome;
	}

}
