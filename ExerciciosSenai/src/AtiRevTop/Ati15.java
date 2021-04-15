package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati15 {
	
	static int idade;
	static double peso, calc;

	public static void main(String[] args) {
		
		//Falta terminar
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		
		if (idade >= 12 && peso >= 60) {
			JOptionPane.showMessageDialog(null, "Toma 1ml, o paciente toma 20 gotas");
		}else if(idade >= 12 && peso < 60) {
			//calc = 20  /500 = 0,04;
			JOptionPane.showMessageDialog(null, "Toma 750mg" + calc + " gostas");
		}else if (idade < 12 && peso >= 5 && peso <= 9) {
			JOptionPane.showMessageDialog(null, "Toma 125mg");
		}else if(idade < 12 && peso >= 9.1 && peso <= 16) {
			JOptionPane.showMessageDialog(null, "Toma 250mg");
		}else if(idade < 12 && peso >= 16.1 && peso <= 24) {
			JOptionPane.showMessageDialog(null, "Toma 375mg");
		}else {
			JOptionPane.showMessageDialog(null, " Peso acima de 24kg Toma 500mg");
		}
		

	}

}
