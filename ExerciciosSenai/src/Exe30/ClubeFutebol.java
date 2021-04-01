package Exe30;

import javax.swing.JOptionPane;

public class ClubeFutebol {
	
	static String nome;
	static int idade;

	public static void main(String[] args) {
		
		nome = JOptionPane.showInputDialog("Nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		if ((idade >= 21) && (idade <=25)) {
			
			JOptionPane.showMessageDialog(null, nome + ", você é Profissional");
			
		}else if((idade >= 16) && (idade <= 20)) {
			
			JOptionPane.showMessageDialog(null, nome + ", você é Júnior");
			
		}else if((idade >= 11) && (idade <= 15)) {
			
			JOptionPane.showMessageDialog(null, nome + ", você é Juvenil");
			
		}else if((idade >= 05) && (idade <= 10)) {
			
			JOptionPane.showMessageDialog(null, nome + ", você é Infantil");
			
		}else {
			
			JOptionPane.showMessageDialog(null, nome + ", você não se encaixa em nenhuma categoria.");
		}
	}

}
