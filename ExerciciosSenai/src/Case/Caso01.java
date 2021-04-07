package Case;

import javax.swing.JOptionPane;

public class Caso01 {

	static int codigo;

	public static void main(String[] args) {

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do curso. "));

		switch (codigo) {
		case 1:
			JOptionPane.showMessageDialog(null, "Curso Tecnico de Informatica subsequente");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Curso Técnico em informatica EJA");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Curso Técnico em Coperativismo");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Curso Técnico em Coperativismo EJA");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Licenciatura em Física");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digite um curso valido");

		}
	}

}
