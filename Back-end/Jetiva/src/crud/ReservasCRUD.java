package crud;

import java.util.Scanner;

import dao.ReservasDAO;
import modelos.Reservas;

public class ReservasCRUD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ReservasDAO reservasDAO = new ReservasDAO();
		
		int opcao = 0, id = 0; 
		
		String origem = "", destino = "", empresa = "", classe = "", assento = "", codigo = "";
		
		Double preco = 0.0;
		
		do {
			
			System.out.println("\n============================== RESERVAS =================================\n");
			System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite a origem: ");
				origem = s.nextLine();
				System.out.print("Digite o destino: ");
				destino = s.nextLine();
				System.out.print("Digite o nome da empresa aérea: ");
				empresa = s.nextLine();
				System.out.print("Digite a classe do voo (Econômica, Executiva, Primeira classe): ");
				classe = s.nextLine();
				System.out.print("Digite o número do assento: ");
				assento = s.nextLine();
				System.out.print("Digite o código do voo: ");
				codigo = s.nextLine();
				System.out.print("Digite o preço do bilhete: ");
				preco = s.nextDouble();
				
				Reservas reserva1 = new Reservas(origem, destino, empresa, classe, assento, preco, codigo);
				
				reservasDAO.create(reserva1);
				break;
			case 2:
				
				for (Reservas u : reservasDAO.read()) {
					System.out.println(u.toString());
				}
				
				break;
			case 3:
				
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				System.out.print("Digite a origem: ");
				origem = s.nextLine();
				System.out.print("Digite o destino: ");
				destino = s.nextLine();
				System.out.print("Digite o nome da empresa aérea: ");
				empresa = s.nextLine();
				System.out.print("Digite a classe do voo (Econômica, Executiva, Primeira classe): ");
				classe = s.nextLine();
				System.out.print("Digite o número do assento: ");
				assento = s.nextLine();
				System.out.print("Digite o código do voo: ");
				codigo = s.nextLine();
				System.out.print("Digite o preço do bilhete: ");
				preco = s.nextDouble();
				
				
				Reservas reserva2 = new Reservas(id, origem, destino, empresa, classe, assento, preco, codigo);
				
				reservasDAO.update(reserva2);
				break;
			case 4:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				reservasDAO.delete(id);
				break;
			case 5:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				Reservas reserva3 = reservasDAO.readByID(id);
				
				System.out.println(reserva3.toString());
				break;
			default:
				
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("Até mais!");
		s.close();
	}

}