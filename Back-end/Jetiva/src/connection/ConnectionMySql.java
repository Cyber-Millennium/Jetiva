package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/jetiva";
    private static final String USER = "root";
    private static final String PASSWORD = "Lacuna@84248293181578";

    public static Connection createConnectionMySQL() throws Exception {
        // Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Cria conexão com o banco de dados -------- com senha
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        
        return connection;
    }

    public static void main(String[] args) throws Exception {
        // Recupera uma conexão com o banco de dados 
        Connection con = new ConnectionMySQL().createConnectionMySQL();

        // Testar a Conexão
        if (con != null) {
            System.out.println(con + "\n\n **** Conexão obtida com sucesso! ****");
            con.close();  
        }
    }
}
