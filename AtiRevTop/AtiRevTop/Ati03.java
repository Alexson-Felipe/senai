package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati03 {
	
	static double salarioMinimo, salarioUsuario, quantidadeSalarios;

	public static void main(String[] args) {
		
		salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario minimo"));
		salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Salario do usuario"));
		
		quantidadeSalarios = salarioUsuario / salarioMinimo;
		
		JOptionPane.showMessageDialog(null, String.format("O usuario recebe %.2f salario minimo.",quantidadeSalarios));

	}

}
