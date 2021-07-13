/**
 * 
 * Desenvolva um programa que controle os chamados de Tecnologia da Informação
 * de uma empresa. o programa deve ler o registro dos chamados e coletar esses
 * dados:
 *
 * Código chamado (número inteiro) Título do chamado; 
 * Funcionário que que abriu o chamado; 
 * Status do chamado(Aberto / Fechado);
 * 
 * Os funcionários devem ser organizados em registros e precisam desses dados:
 * 
 * Matrícula do funcionário (número inteiro) Nome do funcionário Setor que
 * trabalha
 * 
 * Após o cadastro dos chamados um menu deve ser apresentado:
 * 
 * 1 - Listar todos os chamados com suas respectivas informações; 
 * 2 - Pesquisar pelo código do chamado; 
 * 3 - Alterar o status do chamado: 
 * 		O programa deve solicitar o código do chamado; 											
 * 		O usuário deve informar o novo status do chamado;
 * 
 * 4 - Pesquisar pela matrícula do funcionário(listar os chamados vinculados a matrícula pesquisada; 
 * 5 - Listar somente os chamados abertos; 
 * 6 - Listar somente os chamados fechados; 
 * 7 - Listar a quantidade de chamados abertos; 
 * 8 - Listar a quantidade de chamados fechados;
 * 
 * Essas opções devem ser realizadas através de procedimentos.
 * 
 */

//Falta Fazer
public class Ativ03g {
	static RegistroChamados[] chamados;
	static RegistroFuncionarios[] funcionarios;
	static RegistroChamados novosChamados;
	static RegistroFuncionarios novosFuncionarios;
	
	static class RegistroChamados{
		int codigoChamado;
		String titulo, quemAbriuOChamado, statusChamado;
	}
	
	static class RegistroFuncionarios{
		int matriculaFun;
		String nomeFunc, setor;
		
	}
	
	
	public static void main(String[] args) {
		
		chamados = new RegistroChamados[1];
		funcionarios = new RegistroFuncionarios[1];
		
		for (int i = 0; i < args.length; i++) {
			novosChamados = new RegistroChamados();
			
			
		}
		

	}

}
