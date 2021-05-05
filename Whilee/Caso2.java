import javax.swing.JOptionPane;

public class Caso2 {

	static int menu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção" + "\n1 Adição \n2 subtração \n3 Multiplicação \n4 Divisão \n99 Para Sair"));
		
		while (menu == 1 || menu == 2 ||  menu == 3 || menu == 4) {
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção" + "\n1 Adição \n2 subtração \n3 Multiplicação \n4 Divisão \n99 Para Sair"));
			
			if(menu <= 0 || menu >= 5) {
				if(menu == 99) {
					menu = 99;
				}else {
					menu = Integer.parseInt(JOptionPane.showInputDialog("Digite uma valor certo!"));
					menu = 1;
				}
			}
		
		}
		
	}

}
