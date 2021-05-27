import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que realize a leitura de um vetor de nomes e sobrenomes
 * de alunos com 6 posições. Após a leitura mostre os nomes começando pelo
 * Sobrenome e depois nome..
 *
 */
public class Caso06c {
	
	static String[] nome, sobrenome;

	public static void main(String[] args) {

		nome = new String[6];
		sobrenome = new String[6];
		
		for (int i = 0; i < nome.length; i++) {
			
			nome[i] = JOptionPane.showInputDialog("Digite o " + i + "º nome");
			sobrenome[i] = JOptionPane.showInputDialog("Digite o sobrenome");
			
		}
		
		
		for (int i = 0; i < nome.length; i++) {
			
			JOptionPane.showMessageDialog(null, sobrenome[i] + " " + nome[i]);
			
		}
		
	}

}
