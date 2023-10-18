package crud;

import java.util.Scanner;

import dao.PassagensDAO;
import modelos.Passagens;

public class PassagensCRUD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		PassagensDAO passagensDAO = new PassagensDAO();
		
		int opcao = 0, id = 0; 
		
		String empresa = "", destino = "", dataIda = "", dataVolta = "", horaIda = "", horaVolta = "", assento ="", codigo = "", portaoDeEmbarque = "";
		
		do {
			
			System.out.println("\n============================== PASSAGENS =================================\n");
			System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome da empresa: ");
				empresa = s.nextLine();
				System.out.print("Digite o destino: ");
				destino = s.nextLine();
				System.out.print("Digite a data de partida: ");
				dataIda = s.nextLine();
				System.out.print("Digite a data da volta: ");
				dataVolta = s.nextLine();
				System.out.print("Digite o horário da partida: ");
				horaIda= s.nextLine();
				System.out.print("Digite o horário da volta: ");
				horaVolta = s.nextLine();
				System.out.print("Digite o número do assento: ");
				assento = s.nextLine();
				System.out.print("Digite o código da reserva: ");
				codigo = s.nextLine();
				System.out.print("Digite o número do portão de embarque: ");
				portaoDeEmbarque = s.nextLine();
				
				Passagens passagem1 = new Passagens(empresa, destino, dataIda, dataVolta, horaIda, horaVolta, assento, codigo, portaoDeEmbarque);
				
				passagensDAO.create(passagem1);
				break;
			case 2:
				
				for (Passagens u : passagensDAO.read()) {
					System.out.println(u.toString());
				}
				
				break;
			case 3:
				
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				System.out.print("Digite o nome da empresa: ");
				empresa = s.nextLine();
				System.out.print("Digite o destino: ");
				destino = s.nextLine();
				System.out.print("Digite a data de partida: ");
				dataIda = s.nextLine();
				System.out.print("Digite a data da volta: ");
				dataVolta = s.nextLine();
				System.out.print("Digite o horário da partida: ");
				horaIda= s.nextLine();
				System.out.print("Digite o horário da volta: ");
				horaVolta = s.nextLine();
				System.out.print("Digite o número do assento: ");
				assento = s.nextLine();
				System.out.print("Digite o código da reserva: ");
				codigo = s.nextLine();
				System.out.print("Digite o número do portão de embarque: ");
				portaoDeEmbarque = s.nextLine();
				
				
				Passagens passagem2 = new Passagens(id, empresa, destino, dataIda, dataVolta, horaIda, horaVolta, assento, codigo, portaoDeEmbarque);
				
				passagensDAO.update(passagem2);
				break;
			case 4:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				passagensDAO.delete(id);
				break;
			case 5:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				Passagens passagem3 = passagensDAO.readById(id);
				
				System.out.println(passagem3.toString());
				break;
			default:
				
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("Até mais!");
		s.close();
	}

}