package Exe30;

import javax.swing.JOptionPane;

public class EscolaUA {

	static int horaAula, nivel;
	static double salario;
	
	public static void main(String[] args) {
		
		horaAula = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhou?"));
		nivel = Integer.parseInt(JOptionPane.showInputDialog("Qual é o nivel do professor: 1, 2 ou 3"));
		
		if (nivel == 1) {
			salario = horaAula * 12;
			
		}else if (nivel == 2) {
			salario = horaAula * 17;
			
		}else if (nivel == 3) {
			salario = horaAula * 25;
			
		}
		
		JOptionPane.showMessageDialog(null, "Seu salario será: " + salario);

	}

}
