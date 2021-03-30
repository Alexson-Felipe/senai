package Exe23;
import javax.swing.JOptionPane;

public class PadariaPaoBom {

	public static void main(String[] args) {
		
		double paozinho = 0.14;
		double rosca = 1.90;
		double totalPaoRosca, quantoGuardar;
		int quantidadePaozinho, quantidadeRosca;
		
		quantidadePaozinho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Pãozinho vendido: "));
		quantidadeRosca = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Roscas vendida: "));
		
		totalPaoRosca = (quantidadePaozinho * paozinho) + (quantidadeRosca * rosca);
		quantoGuardar = totalPaoRosca * 0.15; 
		
		JOptionPane.showMessageDialog(null,"Valor arrecadado: R$" + String.format("%.2f", totalPaoRosca)
				+ "\n 15% do valor na poupança: R$" + String.format("%.2f", quantoGuardar));
		
	}

}