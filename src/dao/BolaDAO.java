package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Bola;
import java.sql.ResultSet;

public class BolaDAO {

    private Conexao con;
    private String query;
    private PreparedStatement ps;

    public BolaDAO() {
        con = new Conexao();
    }

    public void cadastrarBola(Bola bola) {

        try {

            query = "INSERT INTO bolas (modelo, marca, valor) VALUES (?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, bola.getModelo());
            ps.setString(2, bola.getMarca());
            ps.setDouble(3, bola.getValor());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        }

    }

    public ArrayList<Bola> listarBolas(String modelo) throws ExceptionDAO {
        ArrayList<Bola> bolas = null;
        try {

            String sql = "select * from bolas where modelo like '%" + modelo + "%' order by modelo";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                bolas = new ArrayList<Bola>();
                while (rs.next()) {
                    Bola bola = new Bola();
                    bola.setEtiquetaBola(rs.getString("etiquetaBola"));
                    bola.setModelo(rs.getString("modelo"));
                    bola.setMarca(rs.getString("marca"));
                    bola.setValor(rs.getDouble("valor"));
                    bolas.add(bola);
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
        return bolas;
    }
    public void venderBola(Bola bola) {

        try {

            query = "DELETE FROM bolas where etiquetaBola = ?";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, bola.getEtiquetaBola());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        
        }
    }
}
