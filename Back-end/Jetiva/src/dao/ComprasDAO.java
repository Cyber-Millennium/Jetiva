package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Compras;
import modelos.Reservas;
import modelos.Usuarios;

public class ComprasDAO {
	
	// create
	public void create(Compras compra) {

		String sql = "insert into Compra (data_compra, id_usuario, id_reserva, total_compra) values (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

	        pstm.setString(1, compra.getData_compra());
	        pstm.setInt(2, compra.getUsuario().getID());
	        pstm.setInt(3, compra.getReserva().getID());
	        pstm.setDouble(4, compra.getTotal_compra());

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
	public List<Compras> read() {
		List<Compras> Compras = new ArrayList<Compras>();
		String sql = "select * from usuario_reserva order by id_compra";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Compras compra = new Compras();
				Reservas reserva = new Reservas();
				Usuarios usuario = new Usuarios();

				compra.setID(rset.getInt("id_compra"));
				compra.setData_compra(rset.getString("data_compra"));
				compra.setTotal_compra(rset.getDouble("total_compra"));

				reserva.setID(rset.getInt("id_reserva"));
				reserva.setOrigem(rset.getString("Origem_Reserva"));
				reserva.setDestino(rset.getString("Destino_Reserva"));
				reserva.setEmpresa(rset.getString("Empresa_Reserva"));
				reserva.setClasse(rset.getString("Classe_Reserva"));
				reserva.setAssento(rset.getString("Assento_Reserva"));
				reserva.setPreco(rset.getDouble("Preco_Reserva"));
				reserva.setCodigo(rset.getString("Codigo_Reserva"));
				reserva.setPreco(rset.getDouble("preco_reserva"));

				usuario.setID(rset.getInt("id_usuario"));
				usuario.setNome(rset.getString("nome_usuario"));
				usuario.setEmail(rset.getString("email_usuario"));
				usuario.setSenha(rset.getString("senha_usuario"));

				compra.setReserva(reserva);
				compra.setUsuario(usuario);

				Compras.add(compra);
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

		return Compras;
	}

	// update
	public void update(Compras compra) {
		String sql = "UPDATE Compras SET data_compra = ?, total_compra = ?, id_reserva = ?, id_usuario = ? WHERE id_compra = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, compra.getData_compra());
			pstm.setDouble(2, compra.getTotal_compra());
			pstm.setInt(3, compra.getReserva().getID());
			pstm.setInt(4, compra.getUsuario().getID());
			pstm.setInt(5, compra.getID());

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
		String sql = "DELETE FROM Compras WHERE id_compra = ?";

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
	public Compras readByID(int ID) {
		Compras compra = new Compras();
		String sql = "select * from usuario_reserva WHERE id_compra = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, ID);

			rset = pstm.executeQuery();

			rset.next();

			Reservas reserva = new Reservas();
			Usuarios usuario = new Usuarios();

			compra.setID(rset.getInt("id_compra"));
			compra.setData_compra(rset.getString("data_compra"));
			compra.setTotal_compra(rset.getDouble("total_compra"));

			reserva.setID(rset.getInt("id_reserva"));
			reserva.setOrigem(rset.getString("Origem_Reserva"));
			reserva.setDestino(rset.getString("Destino_Reserva"));
			reserva.setEmpresa(rset.getString("Empresa_Reserva"));
			reserva.setClasse(rset.getString("Classe_Reserva"));
			reserva.setAssento(rset.getString("Assento_Reserva"));
			reserva.setPreco(rset.getDouble("Preco_Reserva"));
			reserva.setCodigo(rset.getString("Codigo_Reserva"));
			reserva.setPreco(rset.getDouble("preco_reserva"));

			usuario.setID(rset.getInt("id_usuario"));
			usuario.setNome(rset.getString("nome_usuario"));
			usuario.setEmail(rset.getString("email_usuario"));
			usuario.setSenha(rset.getString("senha_usuario"));

			compra.setReserva(reserva);
			compra.setUsuario(usuario);

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
		return compra;
	}

}