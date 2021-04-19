package If;

import javax.swing.JOptionPane;

public class Triangulo {
	
	static int lado1, lado2, lado3;

	public static void main(String[] args) {
		
		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro lado"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo lado"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro lado"));
		
		if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
			JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
		}else if ((lado1 != lado2) && (lado1 != lado3)) { 
			JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
		}else {
			JOptionPane.showMessageDialog(null, "Triângulo Isóscele");
		}
		
	}

}
