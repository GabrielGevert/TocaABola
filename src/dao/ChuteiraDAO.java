package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Chuteira;

public class ChuteiraDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    
    public ChuteiraDAO(){
        con = new Conexao();
    }
    
    public void cadastrarChuteira(Chuteira chuteira){
        
        try{
            
            query =  "INSERT INTO chuteiras (modelo, cor, marca, tamanho, valor) VALUES (?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, chuteira.getModelo());
            ps.setString(2, chuteira.getCor());
            ps.setString(3, chuteira.getMarca());
            ps.setInt(4, chuteira.getTamanho());
            ps.setDouble(5, chuteira.getValor());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    }
    
    public ArrayList<Chuteira> listarChuteiras(String marca) throws ExceptionDAO {
        ArrayList<Chuteira> chuteiras = null;
        try {

            String sql = "select * from chuteiras where marca like '%" + marca + "%' order by marca";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                chuteiras = new ArrayList<Chuteira>();
                while (rs.next()) {
                    Chuteira chuteira = new Chuteira();
                    chuteira.setEtiquetaChuteira(rs.getString("etiquetaChuteira"));
                    chuteira.setModelo(rs.getString("modelo"));
                    chuteira.setCor(rs.getString("cor"));
                    chuteira.setMarca(rs.getString("marca"));
                    chuteira.setTamanho(rs.getInt("tamanho"));
                    chuteira.setValor(rs.getDouble("valor"));
                    chuteiras.add(chuteira);
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
        return chuteiras;
    }
    public void venderChuteira(Chuteira chuteira) {

        try {

            query = "DELETE FROM chuteiras where etiquetaChuteira = ?";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, chuteira.getEtiquetaChuteira());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        
        }
    }
}
