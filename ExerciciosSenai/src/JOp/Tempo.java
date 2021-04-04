package JOp;
import javax.swing.JOptionPane;

public class Tempo {

	public static void main(String[] args) {
		
		String nome;
		int idade, calculo;
		
		nome = JOptionPane.showInputDialog("Digite o nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		calculo = idade * 365;
		
		JOptionPane.showMessageDialog(null, nome + " você já viveu " + calculo + " dias");

	}

}
