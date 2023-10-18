package crud;

import java.util.Scanner;

import dao.ContatosDAO;
import modelos.Contatos;

public class ContatosCRUD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ContatosDAO contatosDAO = new ContatosDAO();
		
		int opcao = 0, id = 0; 
		
		String nome = "", email = "", telefone = "", cep = "", endereco = "", numero = "", complemento = "", bairro = "", estado = "", cidade = "", mensagem = "";
		
		do {
			
			System.out.println("\n============================== CONTATOS =================================\n");
			System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
			opcao = s.nextInt();
			s.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nome = s.nextLine();
				System.out.print("Digite o email: ");
				email = s.nextLine();
				System.out.print("Digite a telefone: ");
				telefone = s.nextLine();
				System.out.print("Digite a cep: ");
				cep = s.nextLine();
				System.out.print("Digite a endereco: ");
				endereco = s.nextLine();
				System.out.print("Digite a numero: ");
				numero = s.nextLine();
				System.out.print("Digite a complemento: ");
				complemento = s.nextLine();
				System.out.print("Digite a bairro: ");
				bairro = s.nextLine();
				System.out.print("Digite a estado: ");
				bairro = s.nextLine();
				System.out.print("Digite a cidade: ");
				bairro = s.nextLine();
				System.out.print("Digite a mensagem: ");
				bairro = s.nextLine();
				
				Contatos contatos1 = new Contatos(nome, email, telefone, cep, endereco, numero, complemento, bairro, estado, cidade, mensagem);
				
				contatosDAO.create(contatos1);
				break;
			case 2:
				
				for (Contatos u : contatosDAO.read()) {
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
				System.out.print("Digite a telefone: ");
				telefone = s.nextLine();
				System.out.print("Digite a cep: ");
				cep = s.nextLine();
				System.out.print("Digite a endereco: ");
				endereco = s.nextLine();
				System.out.print("Digite a numero: ");
				numero = s.nextLine();
				System.out.print("Digite a complemento: ");
				complemento = s.nextLine();
				System.out.print("Digite a bairro: ");
				bairro = s.nextLine();
				System.out.print("Digite a estado: ");
				bairro = s.nextLine();
				System.out.print("Digite a cidade: ");
				bairro = s.nextLine();
				System.out.print("Digite a mensagem: ");
				bairro = s.nextLine();
				
				
				Contatos contatos2 = new Contatos(id, nome, email, telefone, cep, endereco, numero, complemento, bairro, estado, cidade, mensagem);
				
				contatosDAO.update(contatos2);
				break;
			case 4:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				contatosDAO.delete(id);
				break;
			case 5:
				System.out.print("Digite um ID: ");
				id = s.nextInt();
				s.nextLine();
				
				Contatos contatos3 = contatosDAO.readByID(id);
				
				System.out.println(contatos3.toString());
				break;
			default:
				
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("Até mais!");
		s.close();
	}

}