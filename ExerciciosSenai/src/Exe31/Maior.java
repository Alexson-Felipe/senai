package Exe31;

import javax.swing.JOptionPane;

public class Maior {
	
	static int valor1, valor2, valor3; 

	public static void main(String[] args) {
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 1"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 2"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 3"));
		
		if((valor1 > valor2) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, valor1 + " É maior 1");
		}else if(valor2 > valor3) {
			JOptionPane.showMessageDialog(null, valor2 + " É maior 2");
		}else {
			JOptionPane.showMessageDialog(null, valor3 + " É maior 3");
		}

	}

}
