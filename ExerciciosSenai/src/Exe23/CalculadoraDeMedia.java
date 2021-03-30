package Exe23;
import javax.swing.JOptionPane;

public class CalculadoraDeMedia {
	
	static String nomeDoAluno;
	
	static double primeiraNota;
	
	static double segundaNota;
	
	static double terceiraNota;
	
	static double mediaFinal;

	public static void main(String[] args) {
		
		nomeDoAluno = JOptionPane.showInputDialog("Por favor, informe o nome do aluno: ");
		
		primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a primeira nota:"));
		
		segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a segunda nota:"));
		
		terceiraNota = Double.parseDouble(JOptionPane.showInputDialog("Por favor, informe a terceira nota:"));
		
		mediaFinal = (primeiraNota + segundaNota + terceiraNota) / 3;
		
		JOptionPane.showMessageDialog(null, "A média do aluno " + nomeDoAluno + " é " + mediaFinal);

		
	}

}
