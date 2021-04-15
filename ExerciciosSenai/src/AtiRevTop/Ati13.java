package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati13 {
	
	static int idade;

	public static void main(String[] args) {
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade >= 65) {
			JOptionPane.showMessageDialog(null, "idoso");
		}else if(idade >= 18 ) {
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}else {
			JOptionPane.showMessageDialog(null, "Menor de idade");
		}
		

	}

}
