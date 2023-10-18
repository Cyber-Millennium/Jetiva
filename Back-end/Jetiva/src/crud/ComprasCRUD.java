package crud;

import java.util.Scanner;

import dao.ComprasDAO;
import dao.ReservasDAO;
import dao.UsuariosDAO;
import modelos.Compras;
import modelos.Reservas;
import modelos.Usuarios;

public class ComprasCRUD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ComprasDAO compraDAO = new ComprasDAO();
		UsuariosDAO usuarioDAO = new UsuariosDAO();
		ReservasDAO reservaDAO = new ReservasDAO();
		
		int opcao = 0, id = 0, id_reserva = 0, id_usuario = 0; 
		
		String data_compra = "";
		
		do {
			
			System.out.println("\n============================== COMPRAS =================================\n");
			System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite a data da compra: ");
				data_compra = s.nextLine();
				System.out.print("Digite o ID do reserva: ");
				id_reserva = s.nextInt();
				s.nextLine();
				System.out.print("Digite o ID do usuario: ");
				id_usuario = s.nextInt();
				s.nextLine();
				
				Usuarios usuario1 = usuarioDAO.readByID(id_usuario);
				Reservas reserva1 = reservaDAO.readByID(id_reserva);
				
				
				Compras compra1 = new Compras(data_compra, usuario1, reserva1);
				
				
				compraDAO.create(compra1);
				break;
			case 2:
				
				for (Compras u : compraDAO.read()) {
					
					System.out.println(u.toString());
					
				}
				
				break;
			case 3:
				System.out.print("Digite o ID da compra: ");
				id = s.nextInt();
				s.nextLine();				
				System.out.print("Digite a data da compra: ");
				data_compra = s.nextLine();
				System.out.print("Digite o ID da reserva: ");
				id_reserva = s.nextInt();
				s.nextLine();
				System.out.print("Digite o ID do usuario: ");
				id_usuario = s.nextInt();
				s.nextLine();
				
				Usuarios usuario2 = usuarioDAO.readByID(id_usuario);
				Reservas reserva2 = reservaDAO.readByID(id_reserva);
				
				
				Compras compra2 = new Compras(id, data_compra, usuario2, reserva2);
				
				compraDAO.update(compra2);
				break;
			case 4:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				compraDAO.delete(id);
				break;
			case 5:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				Compras compra3 = compraDAO.readByID(id);
				
				System.out.println(compra3.toString());
				break;
			default:
				System.out.println(opcao != 0 ? "Opção invalida, digite novamente" : "");
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("Até mais!");
		s.close();

	}

}