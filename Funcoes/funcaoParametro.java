import java.util.Iterator;

public class funcaoParametro {

	static double[] salarioReajustado = null;
	static double[] salarioAtual = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		salarioAtual = new double[1];
		salarioReajustado = new double[1];

		for (int i = 0; i < salarioAtual.length; i++) {

			salarioAtual[i] = 10;

		}

		salarioReajustado = calculaReajuste(salarioAtual);

		for (int i = 0; i < salarioAtual.length; i++) {

			System.out.println("Salario antigo: " + salarioAtual[i] + ". Salario novo: " + salarioReajustado[i]);
		}
	}

	private static double[] calculaReajuste(double[] salarioAtual) {
		// TODO Auto-generated method stub

		for (int i = 0; i < salarioAtual.length; i++) {
			salarioReajustado[i] = 11;
		}

		return salarioReajustado;
	}

}
