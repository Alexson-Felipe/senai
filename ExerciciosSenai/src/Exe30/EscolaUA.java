package Exe30;

import javax.swing.JOptionPane;

public class EscolaUA {

	static int horaAula;
	static double valorPagoN1, valorPagoN2, valorPagoN3;
	
	public static void main(String[] args) {
		
		horaAula = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhou?"));
		
		valorPagoN1 = horaAula * 12;
		valorPagoN2 = horaAula * 17;
		valorPagoN3 = horaAula * 25;
		
		JOptionPane.showMessageDialog(null, "Professor Nvl 1 R$" + valorPagoN1 + "\nProfessor Nvl 2 R$" + valorPagoN2 + "\nProfessor Nvl 3 R$" + valorPagoN3);

	}

}
