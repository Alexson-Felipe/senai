import javax.swing.JOptionPane;

//Faça um algoritmo que exiba
//quantas pessoas possuem mais
//de 18 anos. O algoritmo deverá
//ler a idade até que o usuário
//digite 1000.

public class Caso07b {

	static int idade, dMaior;
	public static void main(String[] args) {
		
		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			if(idade >= 18) {
				dMaior++;
			}
			
		}while(idade != 1000);

		JOptionPane.showMessageDialog(null, "Numero de pessoas de maior: " + dMaior);
	}

}
