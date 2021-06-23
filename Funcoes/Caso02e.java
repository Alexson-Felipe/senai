import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que a partir do nome completo informado pelo usuário e
 * mostre apenas o primeiro nome. O algoritmo deve ser modularizado em uma
 * função responsável por extrair o primeiro nome e devolver para o algoritmo
 * principal.
 *
 */

public class Caso02e {
	
	static String nome;

	public static void main(String[] args) {

		nome = JOptionPane.showInputDialog("Digite seu nome completo");
		
		String[] nomeCompleto = nome.split(" ");
		
		JOptionPane.showMessageDialog(null, nomeCompleto[0]);
		
	}

}
