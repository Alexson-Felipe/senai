import javax.swing.JOptionPane;

public class NotasAluno {
	
	static double nota1, nota2, nota3, media; 

	public static void main(String[] args) {
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		
		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / 10;
		
		JOptionPane.showMessageDialog(null, "Media Final: " + media);

	}

}
