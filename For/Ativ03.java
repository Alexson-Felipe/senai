import javax.swing.JOptionPane;

public class Ativ03 {

	static double numero, resto;
	static int par, impar, negativo, cont;
	
	public static void main(String[] args) {
		
	cont = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	
	for (int i = 0; i < cont; i++) {
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de numeros"));
		
		resto = numero % 2;
		
		if(resto == 0) {
			par++;
		}else {
			if(resto == 1) {
				impar++;
			}else {
				negativo++;
			}
		}
		
	}
	
	JOptionPane.showMessageDialog(null, "Negativo: " + negativo + "\nPar: " + par + "\nImpar: " + impar);
	

	}

}
