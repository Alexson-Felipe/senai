package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati12 {
	
	static int valor;

	public static void main(String[] args) {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		if(valor == 5 || valor == 200 || valor == 400) {
			JOptionPane.showMessageDialog(null, "Ele é igual 5 ou 200 ou 400");
		}else if((valor >= 500) && (valor <= 1000)) {
			JOptionPane.showMessageDialog(null, "O valor está dentro do intervalo 500 a 1000");
		}else {
			JOptionPane.showMessageDialog(null, "O valor está fora do intervalo");
		}

	}

}
