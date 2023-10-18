package crud;

import java.util.Scanner;

import dao.UsuariosDAO;
import modelos.Usuarios;

public class UsuariosCRUD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		UsuariosDAO usuariosDAO = new UsuariosDAO();
		
		int opcao = 0, id = 0; 
		
		String nome = "", email = "", senha = "";
		
		
		do {
			
			System.out.println("\n============================== USUARIOS =================================\n");
			System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nome = s.nextLine();
				System.out.print("Digite o email: ");
				email = s.nextLine();
				System.out.print("Digite a senha: ");
				senha = s.nextLine();
				
				Usuarios usuario1 = new Usuarios(nome, email, senha);
				
				usuariosDAO.create(usuario1);
				break;
			case 2:
				
				for (Usuarios u : usuariosDAO.read()) {
					System.out.println(u.toString());
				}
				
				break;
			case 3:
				
				System.out.print("Digite o ID: ");
				id = s.nextInt();
				s.nextLine();
				System.out.print("Digite o nome: ");
				nome = s.nextLine();
				System.out.print("Digite o email: ");
				email = s.nextLine();
				System.out.print("Digite a senha: ");
				senha = s.nextLine();
				
				
				Usuarios usuario2 = new Usuarios(id, nome, email, senha);
				
				usuariosDAO.update(usuario2);
				break;
			case 4:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				usuariosDAO.delete(id);
				break;
			case 5:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				Usuarios usuario3 = usuariosDAO.readByID(id);
				
				System.out.println(usuario3.toString());
				break;
			default:
				
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("Até mais!");
		s.close();
	}

}