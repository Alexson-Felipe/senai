import javax.swing.JOptionPane;

public class ativ01 {

	static double altura, menorAltura, maiorAltura;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura?"));
			
			if(i == 0) {
				menorAltura = altura;
			}
			
			if(maiorAltura < altura) {
				maiorAltura = altura;
			}
			
			if(altura < menorAltura) {
				menorAltura = altura;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Maior Altura: " + maiorAltura + "\nMenor Altura: " + menorAltura);

	}

}
