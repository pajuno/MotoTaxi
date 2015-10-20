package aplicacao;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import dominio.MotoTaxista;
import servico.AvaliacaoServico;
import servico.BandeiradaServico;
import servico.ChamadoServico;
import servico.ClienteServico;
import servico.EmpresaServico;
import servico.MotoTaxistaServico;
import servico.ServicoFactory;

@SuppressWarnings("unused")
public class Principal {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		int cod, op;
		AvaliacaoServico avaliacaoServico = ServicoFactory.criarAvaliacaoServico();
		BandeiradaServico bandeiradaServico = ServicoFactory.criarBandeiradaServico();
		ChamadoServico chamadoServico = ServicoFactory.criarChamadoServico();
		ClienteServico clienteServico = ServicoFactory.criarClienteServico();
		EmpresaServico empresaServico = ServicoFactory.criarEmpresaServico();
		MotoTaxistaServico motoTaxistaServico = ServicoFactory.criarMotoTaxistaServico();

		do {
			op = Tela.menu(sc);

			switch (op) {
			case 1:
				System.out.println("Caso de uso ainda n�o implementado - Apar�cio");
			case 2:
				System.out.println("Caso de uso ainda n�o implementado - Roberto");
			case 3:
				System.out.println("Caso de uso ainda n�o implementado - Diego");
			case 4:
				System.out.println("Caso de uso ainda n�o implementado - Ana");
			case 5:
				System.out.println("Caso de uso ainda n�o implementado - Apar�cio");
			case 6:
				System.out.println("Caso de uso ainda n�o implementado - Ana");
			case 7:
				System.out.println("Caso de uso ainda n�o implementado - Bruno");
			case 8:
				System.out.println("Caso de uso ainda n�o implementado - Bruno");
			case 9:
				System.out.println("Caso de uso ainda n�o implementado - Diego");
			case 10:
				System.out.println("UC10: Pesquisar MotoTaxistas");
				System.out.println("\nDigite o nome do moto taxista: ");
				String nome = sc.nextLine();

				if (nome.equals(""))
					nome = null;

				List<MotoTaxista> lista = motoTaxistaServico.buscarPorNome(nome);
				System.out.println("Resultado da Pesquisa");

				for (MotoTaxista x : lista) {
					System.out.println(x.getNome() + ", " + x.getPlaca() + ", "
							+ x.getDisponivel() + ", " + x.getEmpresa().getNomeFantasia()+"\n");	
				}
				break;
				
			case 11:
				System.out.println("Caso de uso ainda n�o implementado - Tiago");
			case 12:
				System.out.println("Caso de uso ainda n�o implementado - Tiago");
			case 13:
				System.out.println("Caso de uso ainda n�o implementado - Anna");
			case 14:
				System.out.println("Programa Encerrado.");
				break;
			}

		} while (op != 14);

	}

}
