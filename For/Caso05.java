import javax.swing.JOptionPane;

public class Caso05 {

	static int n, valor, media, valor1;

	public static void main(String[] args) {
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para N"));
		
		for(int i = 1; i <= n; i++) {
			
			valor = Integer.parseInt(JOptionPane.showInputDialog(i + " Valor para armazenar " + " de " + n));
			valor1 += valor;
			
		}
		
		double media = valor1 / n;
		JOptionPane.showMessageDialog(null, media);
		//System.out.println(media);

	}

}
