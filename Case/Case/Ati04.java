package Case;

import javax.swing.JOptionPane;

public class Ati04 {
	
	static double salario;
	static int desconto;

	public static void main(String[] args) {
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto"));
		
		switch(desconto) {
		case 10:
			salario = (salario * 0.10) - salario;
			JOptionPane.showMessageDialog(null, "Salario recebeu um desconto de 10%  R$" + salario);
			break;
		case 20:
			salario = (salario * 0.20) - salario;
			JOptionPane.showMessageDialog(null, "Salario recebeu um desconto de 20%  R$" + salario);
			break;	
		case 30:
			salario = (salario * 0.30) - salario;
			JOptionPane.showMessageDialog(null, "Salario recebeu um desconto de 30%  R$" + salario);
			break;		
		case 40:
			salario = (salario * 0.40) - salario;
			JOptionPane.showMessageDialog(null, "Salario recebeu um desconto de 40%  R$" + salario);
			break;	
		default:
			JOptionPane.showMessageDialog(null, "Salario recebeu um desconto de 0%  R$" + salario);
			break;
		}
	}

}
