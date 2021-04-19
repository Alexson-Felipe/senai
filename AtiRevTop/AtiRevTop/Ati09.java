package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati09 {
	
	static double nota1, nota2, freq, media;

	public static void main(String[] args) {
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		freq = Double.parseDouble(JOptionPane.showInputDialog("Qual a Frequencia"));
		media = (nota1 + nota2) / 2;
		
		if(media >= 7 && freq >= 75) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else if(media >= 7 && freq <= 75) {
			JOptionPane.showMessageDialog(null, "Reprovado por frequência");
		}else if(media <= 7 && freq >= 75) {
			JOptionPane.showMessageDialog(null, "Reprovado por nota");
		}else if(media <= 7 && freq <= 75) {
			JOptionPane.showMessageDialog(null, "Reprovado por nota e frequência");
		}
		
		
	}

}
