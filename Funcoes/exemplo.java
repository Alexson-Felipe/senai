import javax.swing.JOptionPane;

public class exemplo {

	public static void main(String[] args) {

		double resultado = Math.pow(2, 3);
		double raiz = Math.sqrt(25);

		double min = Math.min(Math.pow(2, 3), Math.sqrt(25));

		double max = Math.max(resultado, raiz);
		double paraCima = Math.ceil(2.7);
		double paraBaixo = Math.floor(2.3);
		double random = Math.random();

		String nome = "Joao Souza Fernandes";

		char retornoChar = nome.charAt(1);
		boolean retornoEnd = nome.endsWith("ooo");
		boolean retornoStart = nome.startsWith("joao");
		boolean retornoEquals = nome.equals("joao");
		char[] nomeCharArray = nome.toCharArray();
		String[] nomesV = nome.split(";");
		System.out.println("RETORNO: " + nomesV[0]);

		String caixaAlta = nome.toUpperCase();
		String caixaBaixa = nome.toLowerCase();

	}

}
