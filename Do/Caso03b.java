import javax.swing.JOptionPane;

/*Crie um algoritmo que solicite ao usuário 
* a quantidade de triângulos, e realize o cálculo 
* da hipotenusa dos mesmos. A cada cálculo, 
* apresente o resultado.
* 
* Ps: hipotenusa2 = cateto12 + catero22
*/
public class Caso03b {

	static int triangulo, cateto1, cateto2, hipotenusa, cont = 1;

	public static void main(String[] args) {
		
		triangulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de triangulos"));
		
		do {
			
		cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o cateto 1"));
		cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o cateto 2"));

		hipotenusa = (cateto1 * cateto1) +  (cateto2 * cateto2);
		hipotenusa *= hipotenusa;
		
		JOptionPane.showMessageDialog(null, hipotenusa);

		cont++;
		}while( cont <= triangulo);
		
	}

}
