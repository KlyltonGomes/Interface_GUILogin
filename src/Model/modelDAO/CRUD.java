
package Model.modelDAO;

import Factory.ConnectionFactory;
import Model.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class CRUD {
    private Connection connection;
    Long id;
    String name;
    String lastName;
    String fone;
    String email;
    public CRUD(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getName());
            stmt.setString(2, usuario.getLastName());
            stmt.setString(3, usuario.getFone());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(4, usuario.getPassword());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
    
    

