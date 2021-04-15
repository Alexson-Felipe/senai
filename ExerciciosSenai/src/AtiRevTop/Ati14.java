package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati14 {
	
	static int idade;

	public static void main(String[] args) {
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
		
		if(idade >= 5 && idade <= 10) {
			JOptionPane.showMessageDialog(null, "Categoria Infantil A");
		}else if(idade >= 8 && idade <= 7) {
			JOptionPane.showMessageDialog(null, "Categoria Infantil B");
		}else if(idade >= 11 && idade <= 13) {
			JOptionPane.showMessageDialog(null, "Categoria Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Categoria Juvenil B");
		}else {
			JOptionPane.showMessageDialog(null, "Categoria Sênior");
		}

	}

}
