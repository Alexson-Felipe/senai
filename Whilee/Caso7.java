import javax.swing.JOptionPane;

public class Caso7 {
	
	static int impar;

	public static void main(String[] args) {
		
		while(impar <= 50) {
			
			if(impar % 2 == 1){
				JOptionPane.showMessageDialog(null, "O valor " + impar + " é ímpar");
			}
			
			impar++;
			
		}

	}

}
