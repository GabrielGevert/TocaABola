package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    
    public ClienteDAO(){
        con = new Conexao();
    }
    
    public void cadastrarCliente(Cliente cliente){
        
        try{
            
            query =  "INSERT INTO clientes (nome, email, cpf, telefone, newsletter) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());            
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getNewsletter());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    }
    
    public ArrayList<Cliente> listarClientes(String cpf) throws ExceptionDAO {
        ArrayList<Cliente> clientes = null;
        try {

            String sql = "select * from clientes where cpf like '%" + cpf + "%' order by cpf";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                clientes = new ArrayList<Cliente>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setNewsletter(rs.getString("newsletter"));
                    clientes.add(cliente);
                }
            }

        } catch (SQLException ex) {
            throw new ExceptionDAO("Erro ao consultar itens: " + ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                throw new ExceptionDAO("Erro ao fechar ps: " + ex);
            }
        }
        return clientes;
    }
}