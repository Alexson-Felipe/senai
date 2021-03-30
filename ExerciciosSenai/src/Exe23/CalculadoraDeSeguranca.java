package Exe23;
import javax.swing.JOptionPane;

public class CalculadoraDeSeguranca {

	static int numeroDeDias;
	static int anos;
	static int meses;
	static int diasRestantes;

	public static void main(String[] args) {

		numeroDeDias = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de dias sem acidente:"));
		anos = numeroDeDias / 360;
		diasRestantes = numeroDeDias % 360;
		meses = diasRestantes / 30;
		diasRestantes = diasRestantes % 30;
		JOptionPane.showMessageDialog(null, "Anos: " + anos + " Meses: " + meses + " Dias " + diasRestantes);
	}

}
