package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Camiseta;

public class CamisetaDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    
    public CamisetaDAO(){
        con = new Conexao();
    }
    
    public void cadastrarCamiseta(Camiseta camiseta){
        
        try{
            
            query =  "INSERT INTO camisetas (time, modelo, tamanho, valor) VALUES (?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, camiseta.getTime());
            ps.setString(2, camiseta.getModelo());
            ps.setString(3, camiseta.getTamanho());
            ps.setDouble(4, camiseta.getValor());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    }
    
    public ArrayList<Camiseta> listarCamisetas(String time) throws ExceptionDAO {
        ArrayList<Camiseta> camisetas = null;
        try {

            String sql = "select * from camisetas where time like '%" + time + "%' order by time";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                camisetas = new ArrayList<Camiseta>();
                while (rs.next()) {
                    Camiseta camiseta = new Camiseta();
                    camiseta.setEtiquetaCamiseta(rs.getString("etiquetaCamiseta"));
                    camiseta.setTime(rs.getString("time"));
                    camiseta.setModelo(rs.getString("modelo"));
                    camiseta.setTamanho(rs.getString("tamanho"));
                    camiseta.setValor(rs.getDouble("valor"));
                    camisetas.add(camiseta);
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
        return camisetas;
    }
    public void venderCamiseta(Camiseta camiseta) {

        try {

            query = "DELETE FROM camisetas where etiquetaCamiseta = ?";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, camiseta.getEtiquetaCamiseta());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        
        }
    }
}