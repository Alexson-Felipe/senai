import javax.swing.JOptionPane;

public class Caso3 {
	
	static int hipotenusa, cateto1, cateto2, triangulos, quant = 1;
	

	public static void main(String[] args) {
		
		triangulos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de triangulos"));
		
		while(quant <= triangulos) {
			
			cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a valor do Cateto1"));
			cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a valor do Cateto2"));
			
			hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
			hipotenusa *= hipotenusa;
			
			//System.out.println(hipotenusa);
			
			JOptionPane.showMessageDialog(null, hipotenusa);
			
			quant++;
			
		}

	}

}
