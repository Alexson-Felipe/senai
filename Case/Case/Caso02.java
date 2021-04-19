package Case;

import javax.swing.JOptionPane;

public class Caso02 {
	
	static double salario, aumento;
	static int cargo;

	public static void main(String[] args) {
		
		salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
		cargo = Integer.parseInt(JOptionPane.showInputDialog("(1) Programador \n(2) Analista de Sistemas \n(3) Analista de Banco de Dados"));
		
		
		switch(cargo) {
		case 1:
			aumento = (salario * 1.50);
			JOptionPane.showMessageDialog(null, "Programador recebe de aumento 50% " + aumento);
			break;
		case 2:
			aumento = (salario * 1.40);
			JOptionPane.showMessageDialog(null, "Analista de Sistemas 40% " + aumento);
			break;
		case 3:
			aumento = (salario * 1.30);
			JOptionPane.showMessageDialog(null, "Analista de Banco de Dados 30% " + aumento);
			break;
		default:	
			JOptionPane.showMessageDialog(null, "Cargo Invalido");
			break;
		}
		
		
		
	}

}
