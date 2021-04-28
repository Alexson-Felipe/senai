import javax.swing.JOptionPane;

public class Caso01 {
	
	static int numero , i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		for (i = 0; i <= numero; i++) {
			
			JOptionPane.showMessageDialog(null, i );
			
		}
		
	}

}
