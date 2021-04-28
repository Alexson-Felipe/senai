import javax.swing.JOptionPane;

public class Caso04 {
	
	static int x, y;

	public static void main(String[] args) {
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X"));
		
		for(int i = 1; i <= 100; i++) {
			
			//System.out.println(y +" "+x +" "+i);
			
			y += x + i;
		
		}
		JOptionPane.showMessageDialog(null, y);

	}

}
