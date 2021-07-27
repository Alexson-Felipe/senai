import javax.swing.JOptionPane;

public class atividade04 {

	static String lista;
	static String[] itensLista, nomesCidades;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista = "Pessoa 1-Tubar찾o/SC;\n" + "Pessoa 2-Florian처polis/SC;\n" + "Pessoa 3-S찾o Paulo/SP;\n"
				+ "Pessoa 4-Osasco/SP;\n" + "Pessoa 5-Porto Alegre/RS;\n" + "Pessoa 6- Rio de Janeiro/RJ;\n"
				+ "Pessoa 7-S찾o Paulo/SP\n" + "Pessoa 8-Florian처polis/SC;\n" + "Pessoa 9- Rio de Janeiro/RJ;\n"
				+ "Pessoa 10-Tubar찾o/SC\n" + "";

		itensLista = lista.split(";");

		for (int i = 0; i < itensLista.length; i++) {
			
			 Object[] menu = { "OK", "Vendas", "Produtos",  };
		      JOptionPane.showOptionDialog(null, "Selecione uma op豫o", "         MENU DELIVERY",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);

		     
			nomesCidades = itensLista[i].split("-");

			System.out.println("Nome: " + nomesCidades[0] + ". " + "Mora em: " + nomesCidades[1]);

		}

	}

}


