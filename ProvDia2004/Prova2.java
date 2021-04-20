import javax.swing.JOptionPane;

public class Prova2 {

	static String nome;
	static int socio, idade;
	static char time;

	public static void main(String[] args) {

		nome = JOptionPane.showInputDialog("Digite o nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		socio = Integer.parseInt(JOptionPane.showInputDialog("0 para Titular \n1 para Dependente"));
		time = JOptionPane.showInputDialog("V = Vitalício \nT = Temporário").charAt(0);

		switch (socio) {
		case 0:
			if(time == 'V' && idade >= 70) {
				JOptionPane.showMessageDialog(null, "ESSA PESSOA É \nTipo de Sócio: Titular \nTime: Vitalício \nIdade: Maior que 70 anos \nLocal: Fila 1");
			}else if(time == 'V' && idade <= 69) {
				JOptionPane.showMessageDialog(null, "ESSA PESSOA É \nTipo de Sócio: Titular \nTime: Vitalício \nIdade: Menor que 69 anos \nLocal: Fila 2");
			}else {
				JOptionPane.showMessageDialog(null, "ESSA PESSOA É \nTipo de Sócio: Titular \nTime: Temporário \nIdade: Todas \nLocal: Fila 3 e 4");
			}
			break;
		case 1:
			if(time == 'V') {
				JOptionPane.showMessageDialog(null, "ESSA PESSOA É \nTipo de Sócio: Dependente \nTime: Vitalício \nIdade: Todas \nLocal: Fila 5 e 6");
			}else {
				JOptionPane.showMessageDialog(null, "ESSA PESSOA É \nTipo de Sócio: Dependente \nTime: Temporário \nIdade: Todas \nLocal: Fila 7");
			}
			break;	
		default:
			break;
		}

	}

}
