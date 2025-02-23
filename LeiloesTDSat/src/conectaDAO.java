
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adm
 */
public class conectaDAO {
    private final String password = "996562165";
    private final String url = "jdbc:mysql://localhost/uc11";
    private final String user = "root";
    
    
    public Connection GetConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro){
            System.out.println("conectado com erro: " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na na conexão: " + erro.getMessage());
        }
        return conn;
    }
    
}
