package Case;

import javax.swing.JOptionPane;

public class Caso03 {
	
	static char tamanho;

	public static void main(String[] args) {
		
		tamanho =  JOptionPane.showInputDialog("Digite o tamanho da camisa").charAt(0);
		
		switch(tamanho){
			case 'P':
				JOptionPane.showMessageDialog(null, "Tamanho Pequeno");
				break;
			case 'M':
				JOptionPane.showMessageDialog(null, "Tamanho Médio");
				break;
			case 'G':
				JOptionPane.showMessageDialog(null, "Tamanho Grande");
				break;
			default:	
				JOptionPane.showMessageDialog(null, "Tamanho Inválido");
				break;
			
		}

	}

}
