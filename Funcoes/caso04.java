import javax.swing.JOptionPane;

public class caso04 {

	static String[] nome;
	static double[] salario = null;
	static double[] salarioReajustado = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nome = new String[5];
		salario = new double[nome.length];
		salarioReajustado = new double[nome.length];

		for (int i = 0; i < nome.length; i++) {

			nome[i] = JOptionPane.showInputDialog("Digite seu nome.");
			salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));

		}

		salarioReajustado = reajusteSalario(salario);

		for (int i = 0; i < nome.length; i++) {

			System.out.println(nome[i] + ". Salário sem reajuste: " + salario[i] + ". Salário reajustado: "
					+ salarioReajustado[i]);
		}
	}

	private static double[] reajusteSalario(double[] salario) {
		// TODO Auto-generated method stub

		for (int i = 0; i < salario.length; i++) {

			salarioReajustado[i] =  salario[i] * 1.1;
		}

		return salarioReajustado;
	}

}
