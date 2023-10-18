package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Reservas;

public class ReservasDAO {
	
	// create
	public void create(Reservas reserva) {

		String sql = "insert into Reservas (origem_reserva, destino_reserva, empresa_reserva, classe_reserva, assento_reserva, preco_reserva, codigo_reserva) values (?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, reserva.getOrigem());
			pstm.setString(2, reserva.getDestino());
			pstm.setString(3, reserva.getEmpresa());
			pstm.setString(4, reserva.getClasse());
			pstm.setString(5, reserva.getAssento());
			pstm.setDouble(6, reserva.getPreco());
			pstm.setString(7, reserva.getCodigo());

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
	public List<Reservas> read() {
		List<Reservas> reservas = new ArrayList<Reservas>();
		String sql = "select * from Reservas";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Reservas reserva = new Reservas();

				reserva.setID(rset.getInt("id_reserva"));
				reserva.setOrigem(rset.getString("origem_reserva"));
				reserva.setDestino(rset.getString("destino_reserva"));
				reserva.setEmpresa(rset.getString("empresa_reserva"));
				reserva.setClasse(rset.getString("classe_reserva"));
				reserva.setAssento(rset.getString("assento_reserva"));
				reserva.setPreco(rset.getDouble("preco_reserva"));
				reserva.setCodigo(rset.getString("codigo_reserva"));
				reservas.add(reserva);
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

		return reservas;
	}

	// update
	public void update(Reservas reserva) {
		String sql = "UPDATE Reservas SET origem_reserva = ?, destino_reserva = ?, empresa_reserva = ?, classe_reserva = ?, assento_reserva = ?, preco_reserva = ?, codigo_reserva = ? WHERE id_reserva = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, reserva.getOrigem());
			pstm.setString(2, reserva.getDestino());
			pstm.setString(3, reserva.getEmpresa());
			pstm.setString(4, reserva.getClasse());
			pstm.setString(5, reserva.getAssento());
			pstm.setDouble(6, reserva.getPreco());
			pstm.setString(7, reserva.getCodigo());
			pstm.setInt(8, reserva.getID());

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
		String sql = "DELETE FROM Reservas WHERE id_reserva = ?";

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
	public Reservas readByID(int id) {
		Reservas reserva = new Reservas();
		String sql = "select * from Reservas WHERE id_reserva = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			reserva.setID(rset.getInt("ID_reserva"));
			reserva.setOrigem(rset.getString("origem_reserva"));
			reserva.setDestino(rset.getString("destino_reserva"));
			reserva.setEmpresa(rset.getString("empresa_reserva"));
			reserva.setClasse(rset.getString("classe_reserva"));
			reserva.setAssento(rset.getString("assento_reserva"));
			reserva.setPreco(rset.getDouble("preco_reserva"));
			reserva.setCodigo(rset.getString("codigo_reserva"));

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
		return reserva;
	}

}