package Exe30;

import javax.swing.JOptionPane;

public class PesoIdeal {
	
	static double altura, ideal;
	static char sexo;

	public static void main(String[] args) {
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		sexo = JOptionPane.showInputDialog("Digite o sexo F ou M").charAt(0);
		
		if (sexo == 'M') {
			
			ideal = (72.7 * altura) - 58;
			
			if(ideal >= 72.7) {
				
				JOptionPane.showMessageDialog(null, "Está acima do peso ideal: " + ideal);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Está abaixo do peso ideal: " + ideal);
				
			}
			
		}else if(sexo == 'F') {
			
			
			ideal = (62.1 * altura) - 44.7;
			
			if (ideal >= 62.1) {
				
				JOptionPane.showMessageDialog(null, "Está acima do peso ideal: " + ideal);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Está abaixo do peso ideal: " + ideal);
				
			}
			
		}
		

	}

}
