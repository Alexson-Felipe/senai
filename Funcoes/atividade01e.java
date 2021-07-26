import javax.swing.JOptionPane;

public class atividade01e {

	static String[] nome;
	static String nomeM = "";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nome = new String[2];
		for (int i = 0; i < nome.length; i++) {
			

			nome[i] = JOptionPane.showInputDialog("Digite o nome");
			nomeM += textoCaixaAlta(nome[i]);

		}
		
		
		JOptionPane.showMessageDialog(null, nomeM);
		
	}


	private static String textoCaixaAlta(String nome2) {
		// TODO Auto-generated method stub
		
			nome2 = nome2.toUpperCase()+"\n";
			
		return nome2;
	}

}
