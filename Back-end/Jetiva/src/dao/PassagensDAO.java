package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Passagens;

public class PassagensDAO {
	
	// create
	public void create(Passagens passagem) {

		String sql = "insert into Passagens (empresa_passagem, destino_passagem, dataIda_passagem, dataVolta_passagem, horaIda_passagem, horaVolta_passagem, assento_passagem, codigo_passagem, portaoDeEmbarque_passagem) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passagem.getEmpresa());
			pstm.setString(2, passagem.getDestino());
			pstm.setString(3, passagem.getDataIda());
			pstm.setString(4, passagem.getDataVolta());
			pstm.setString(5, passagem.getHoraIda());
			pstm.setString(6, passagem.getHoraVolta());
			pstm.setString(7, passagem.getAssento());
			pstm.setString(8, passagem.getCodigo());
			pstm.setString(9, passagem.getPortaoDeEmbarque());

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
	public List<Passagens> read() {
		List<Passagens> passagens = new ArrayList<Passagens>();
		String sql = "select * from Passagens";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Passagens passagem = new Passagens();

				passagem.setID(rset.getInt("id_passagem"));
				passagem.setEmpresa(rset.getString("empresa_passagem"));
				passagem.setDestino(rset.getString("destino_passagem"));
				passagem.setDataIda(rset.getString("dataIda_passagem"));
				passagem.setDataVolta(rset.getString("dataVolta_passagem"));
				passagem.setHoraIda(rset.getString("horaIda_passagem"));
				passagem.setHoraVolta(rset.getString("horaVolta_passagem"));
				passagem.setAssento(rset.getString("assento_passagem"));
				passagem.setCodigo(rset.getString("codigo_passagem"));
				passagem.setPortaoDeEmbarque(rset.getString("portaoDeEmbarque_passagem"));
				passagens.add(passagem);
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

		return passagens;
	}

	// update
	public void update(Passagens passagem) {
		String sql = "UPDATE Passagens SET empresa_passagem = ?, destino_passagem = ?, dataIda_passagem = ?, dataVolta_passagem = ?, horaIda_passagem = ?, horaVolta_passagem = ?, assento_passagem = ? codigo_passagem = ?, portaoDeEmbarque_passagem = ?, WHERE id_passagem = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passagem.getEmpresa());
			pstm.setString(2, passagem.getDestino());
			pstm.setString(3, passagem.getDataIda());
			pstm.setString(4, passagem.getDataVolta());
			pstm.setString(5, passagem.getHoraIda());
			pstm.setString(6, passagem.getHoraVolta());
			pstm.setString(7, passagem.getAssento());
			pstm.setString(8, passagem.getCodigo());
			pstm.setString(9, passagem.getPortaoDeEmbarque());
			pstm.setInt(10, passagem.getID());

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
		String sql = "DELETE FROM Passagens WHERE id_passagem = ?";

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
	public Passagens readById(int id) {
		Passagens passagem = new Passagens();
		String sql = "select * from Passagens WHERE id_passagem = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			passagem.setID(rset.getInt("ID_passagem"));
			passagem.setEmpresa(rset.getString("empresa_passagem"));
			passagem.setDestino(rset.getString("destino_passagem"));
			passagem.setDataIda(rset.getString("dataIda_passagem"));
			passagem.setDataVolta(rset.getString("dataVolta_passagem"));
			passagem.setHoraIda(rset.getString("horaIda_passagem"));
			passagem.setHoraVolta(rset.getString("horaVolta_passagem"));
			passagem.setAssento(rset.getString("assento_passagem"));
			passagem.setCodigo(rset.getString("codigo_passagem"));
			passagem.setPortaoDeEmbarque(rset.getString("portaoDeEmbarque_passagem"));

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
		return passagem;
	}

}