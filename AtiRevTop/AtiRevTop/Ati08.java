package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati08 {

	static String nome;
	static int tipoSocio, idade;
	static char time;

	public static void main(String[] args) {

		nome = JOptionPane.showInputDialog("Digite o nome");
		tipoSocio = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de sócio 0 para vip e 1 para normal"));
		time = JOptionPane.showInputDialog("Digite " + "c" + " para casa e " + "v" + " para visitante").charAt(0);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

		if (tipoSocio == 0) {
			if (time == 'c') {
				JOptionPane.showMessageDialog(null, "Tipo de sócio: Vip \nTime: Casa \nIdade: Todas \nCadeiras Azuis");
			} else {
				JOptionPane.showMessageDialog(null,
						"Tipo de sócio: Vip \nTime: Visitante \nIdade: Todas \nCadeiras Vermelhas");
			}
		} else if(tipoSocio == 1) {
			if (time == 'c' && idade > 0 && idade < 30) {
				JOptionPane.showMessageDialog(null,
						"Tipo de sócio: Normal \nTime: Casa \nIdade: 0 até 30 \nCadeiras Amarelas");
			} else if (time == 'c' && idade >= 31) {
				JOptionPane.showMessageDialog(null,
						"Tipo de sócio: Normal \nTime: Casa \nIdade: a partir de 31 \nCadeiras Verdes");
			} else {
				JOptionPane.showMessageDialog(null,
						"Tipo de sócio: Normal \nTime: Visitante \nIdade: Todas \nCadeiras Pretas");
			}
		}

	}

}
