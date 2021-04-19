package JOp;
import javax.swing.JOptionPane;

public class CalcularArea {
	
	static int altura;
	static int largura;
	static int area;
	
	public static void main(String[] args) {
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a area:"));
		largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura:"));
		area = altura * largura;
		
		JOptionPane.showMessageDialog(null, "A dimensão do terreno é: " + area);

	}

}
