import javax.swing.JOptionPane;

public class Ativ05 {
	
	static int quantidadeCd;
	static double valorCd, somaCd, mediaCd;

	public static void main(String[] args) {
		
		quantidadeCd = Integer.parseInt(JOptionPane.showInputDialog("Quantos Cd's tem sua coleção"));
		
		for (int i = 1; i <  quantidadeCd; i++) {
			
			valorCd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + i +" º CD"));
			
			somaCd = valorCd + somaCd;
			
		}
		
		mediaCd = somaCd / quantidadeCd;
		
		JOptionPane.showMessageDialog(null, "O valor total gasto nos Cds é " + somaCd + " A media gasta m cada CD é: " + mediaCd );

	}

}
