package Case;

import javax.swing.JOptionPane;

public class Ati02 {
	
	static int digito;
	static String mes = "Mês invalido";

	public static void main(String[] args) {
		
		digito = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês"));
		
		switch(digito) {
		case 1:
			mes = "Janeiro";
			break;
		case 2:	
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:	
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;	
		case 11:
			mes = "Novembro";
			break;	
		case 12:
			mes = "Dezembro";
			break;		
		
		}
		JOptionPane.showMessageDialog(null, mes);

	}

}
