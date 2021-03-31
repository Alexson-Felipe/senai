package Exe30;

import javax.swing.JOptionPane;

public class EmpresaKanoha {

	static double horaTrabalhada, hora, salarioLiquido;
	static char gerente;

	public static void main(String[] args) {
	
		horaTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas trabalhou"));
		gerente = JOptionPane.showInputDialog("É gerente? S = Sim N = Não").charAt(0);
		
		if(horaTrabalhada > 8) {
			
			if(gerente == 'S') {
				
				hora = (((8 * 10) + ((horaTrabalhada - 8) * 15)) * 1.25);
				salarioLiquido = hora - (hora * 0.1);
				JOptionPane.showMessageDialog(null, "Salário Bruto = R$" + hora + "\nSalário Líquido = R$" + salarioLiquido);
				
			}else if(gerente == 'N') {
				
				hora = (8 * 10) + ((horaTrabalhada - 8) * 15);
				salarioLiquido = hora - (hora * 0.1);
				JOptionPane.showMessageDialog(null, "Salário Bruto = R$" + hora + "\nSalário Líquido = R$" + salarioLiquido);
			}
			
		}
	
		else {
	
			if(gerente == 'S') {
				
				hora = ((8 * 10) * 1.25);
				salarioLiquido = hora - (hora * 0.1);
				JOptionPane.showMessageDialog(null, "Salário Bruto = R$" + hora + "\nSalário Líquido = R$" + salarioLiquido);
				
			}else if(gerente == 'N') {
				
				hora = 8 * 10;
				salarioLiquido = hora - (hora * 0.1);
				JOptionPane.showMessageDialog(null, "Salário Bruto = R$" + hora + "\nSalário Líquido = R$" + salarioLiquido);
			}
				
			}
			

	}

}
