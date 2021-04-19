package Case;

import javax.swing.JOptionPane;

public class Ati06 {

	static int mes;
	static String msg = "Mês invalido";

	public static void main(String[] args) {

		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês"));

		switch (mes) {
		case 1:
		case 2:
		case 3:
			msg = "1° Trimestre";
			break;
		case 4:
		case 5:
		case 6:
			msg = "2° Trimestre";
			break;
		case 7:
		case 8:
		case 9:
			msg = "3° Trimestre";
			break;
		case 10:
		case 11:
		case 12:
			msg = "4° Trimestre";
			break;
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
