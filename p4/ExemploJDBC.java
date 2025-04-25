import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Exemplo completo de conexão com MySQL usando JDBC em um único arquivo
 */
public class ExemploJDBC {
    public static void main(String[] args) {
        // Parâmetros de conexão com o banco de dados
        String url = "jdbc:mysql://localhost/usuariosdb";
        String usuario = "root";
        String senha = "mentemaker"; // Substitua pela sua senha real
        
        // Declaração dos recursos JDBC
        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Passo 1: Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver MySQL carregado com sucesso!");
            
            // Passo 2: Estabelecer conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");
            
            // Passo 3: Criar statement para executar consultas SQL
            stmt = conexao.createStatement();
            
            // Passo 4: Executar a consulta SQL
            String sql = "SELECT * FROM usuarios";
            rs = stmt.executeQuery(sql);
            
            // Passo 5: Processar os resultados
            System.out.println("\nResultados da consulta:");
            System.out.println("------------------------");
            
            // Iterar sobre os resultados
            while(rs.next()) {
                // Recuperar dados pelo nome da coluna
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                
                // Exibir os valores
                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);
            }
            
        } catch(SQLException e) {
            // Tratar erros de SQL
            System.out.println("Erro SQL: " + e.getMessage());
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            // Tratar erro de driver não encontrado
            System.out.println("Driver MySQL não encontrado: " + e.getMessage());
        } finally {
            // Passo 6: Fechar todos os recursos
            try {
                // Fechar ResultSet
                if(rs != null) {
                    rs.close();
                }
                
                // Fechar Statement
                if(stmt != null) {
                    stmt.close();
                }
                
                // Fechar Connection
                if(conexao != null) {
                    conexao.close();
                    System.out.println("\nConexão fechada com sucesso!");
                }
            } catch(SQLException e) {
                System.out.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}