
public class atividade04 {

	static String lista;
	static String[] itensLista, nomesCidades;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista = "Pessoa 1-Tubarão/SC;\n" + "Pessoa 2-Florianópolis/SC;\n" + "Pessoa 3-São Paulo/SP;\n"
				+ "Pessoa 4-Osasco/SP;\n" + "Pessoa 5-Porto Alegre/RS;\n" + "Pessoa 6- Rio de Janeiro/RJ;\n"
				+ "Pessoa 7-São Paulo/SP\n" + "Pessoa 8-Florianópolis/SC;\n" + "Pessoa 9- Rio de Janeiro/RJ;\n"
				+ "Pessoa 10-Tubarão/SC\n" + "";

		itensLista = lista.split(";");

		for (int i = 0; i < itensLista.length; i++) {

			nomesCidades = itensLista[i].split("-");

			System.out.println("Nome: " + nomesCidades[0] + ". " + "Mora em: " + nomesCidades[1]);

		}

	}

}
