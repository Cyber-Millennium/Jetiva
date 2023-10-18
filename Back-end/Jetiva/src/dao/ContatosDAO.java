package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Contatos;

public class ContatosDAO {
	
	// create
	public void create(Contatos contato) {

		String sql = "insert into Contatos (nome_contato, email_contato, telefone_contato, cep_contato, endereco_contato, numero_contato, complemento_contato, bairro_ contato, estado_contato, cidade_contato, mensagem_contato) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getEmail());
			pstm.setString(3, contato.getTelefone());
			pstm.setString(4, contato.getCEP());
			pstm.setString(5, contato.getEndereco());
			pstm.setString(6, contato.getNumero());
			pstm.setString(7, contato.getComplemento());
			pstm.setString(8, contato.getBairro());
			pstm.setString(9, contato.getEstado());
			pstm.setString(10, contato.getCidade());
			pstm.setString(11, contato.getMensagem());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// read
	public List<Contatos> read() {
		List<Contatos> contatos = new ArrayList<Contatos>();
		String sql = "select * from Contatos";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Contatos contato = new Contatos();

				contato.setID(rset.getInt("id_contato"));
				contato.setNome(rset.getString("nome_contato"));
				contato.setEmail(rset.getString("email_contato"));
				contato.setTelefone(rset.getString("telefone_contato"));
				contato.setCEP(rset.getString("cep_contato"));
				contato.setEndereco(rset.getString("endereco_contato"));
				contato.setNumero(rset.getString("numero_contato"));
				contato.setComplemento(rset.getString("complemento_contato"));
				contato.setBairro(rset.getString("bairro_contato"));
				contato.setEstado(rset.getString("estado_contato"));
				contato.setCidade(rset.getString("cidade_contato"));
				contato.setMensagem(rset.getString("mensagem_contato"));
				contatos.add(contato);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return contatos;
	}

	// update
	public void update(Contatos contato) {
		String sql = "UPDATE Contatos SET nome_contato = ?, email_contato = ?, telefone_contato = ?, cep_contato = ?, endereco_contato = ?, numero_contato = ?, complemento_contato = ? bairro_contato = ?, estado_contato = ?, cidade_contato = ?, mensagem_contato = ?, WHERE id_contato = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getEmail());
			pstm.setString(3, contato.getTelefone());
			pstm.setString(4, contato.getCEP());
			pstm.setString(5, contato.getEndereco());
			pstm.setString(6, contato.getNumero());
			pstm.setString(7, contato.getComplemento());
			pstm.setString(8, contato.getBairro());
			pstm.setString(9, contato.getEstado());
			pstm.setString(10, contato.getCidade());
			pstm.setString(11, contato.getMensagem());
			pstm.setInt(12, contato.getID());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// delete
	public void delete(int id) {
		String sql = "DELETE FROM Contatos WHERE id_contato = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// readById
	public Contatos readByID(int id) {
		Contatos contato = new Contatos();
		String sql = "select * from Contatos WHERE id_contato = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			contato.setID(rset.getInt("ID_contato"));
			contato.setNome(rset.getString("nome_contato"));
			contato.setEmail(rset.getString("email_contato"));
			contato.setTelefone(rset.getString("telefone_contato"));
			contato.setCEP(rset.getString("cep_contato"));
			contato.setEndereco(rset.getString("endereco_contato"));
			contato.setNumero(rset.getString("numero_contato"));
			contato.setComplemento(rset.getString("complemento_contato"));
			contato.setBairro(rset.getString("bairro_contato"));
			contato.setEstado(rset.getString("estado_contato"));
			contato.setCidade(rset.getString("cidade_contato"));
			contato.setMensagem(rset.getString("mensagem_contato"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return contato;
	}

}