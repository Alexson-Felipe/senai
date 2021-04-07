package Case;

import javax.swing.JOptionPane;

public class Caso04 {

	static int codigo;
	static double salario, aumento;

	public static void main(String[] args) {
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário: \n101 Gerente \n102 Engenheiro \n103 Técnico"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario"));
		
		switch(codigo) {
			case 101:
				aumento = salario * 1.10;
				break;
			case 102:
				aumento = salario * 1.20;
				break;	
			case 103:
				aumento = salario * 1.30;
				break;
			default:
				aumento = salario * 1.40;
				break;
		}
		JOptionPane.showMessageDialog(null, "Salário Antigo: " + salario + "\nNovo Salário: " + aumento + "\nDiferença: " + (aumento - salario));

	}

}
