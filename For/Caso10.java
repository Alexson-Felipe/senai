import javax.swing.JOptionPane;

public class Caso10 {
	
	static int tab, tab1;

	public static void main(String[] args) {
		
		tab = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		
		for(int i = 1; i <= 5; i++) {
			
			tab1 = tab * i;
			JOptionPane.showMessageDialog(null, tab + " x " + i + " = " + tab1);
		}
		

	}

}
