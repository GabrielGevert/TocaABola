package dao;

import model.Acessorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class AcessoriosDAO {

    private Conexao con;
    private String query;
    private PreparedStatement ps;

    public AcessoriosDAO() {
        con = new Conexao();
    }

    public void cadastrarAcessorios(Acessorios acessorios) {

        try {

            query = "INSERT INTO acessórios (descricao, valor) VALUES (?, ?)";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, acessorios.getDescricao());
            ps.setDouble(2, acessorios.getValor());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        }

    }

    public ArrayList<Acessorios> listarAcessorios(String descricao) throws ExceptionDAO {
        ArrayList<Acessorios> acessorios = null;
        try {

            String sql = "select * from acessórios where descricao like '%" + descricao + "%' order by descricao";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                acessorios = new ArrayList<Acessorios>();
                while (rs.next()) {
                    Acessorios acessorio = new Acessorios();
                    acessorio.setEtiquetaAcessorio(rs.getString("etiquetaAcessorio"));
                    acessorio.setDescricao(rs.getString("descricao"));
                    acessorio.setValor(rs.getDouble("valor"));
                    acessorios.add(acessorio);
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
        return acessorios;
    }
    
    public void venderAcessorios(Acessorios acessorios) {

        try {

            query = "DELETE FROM acessórios where etiquetaAcessorio = ?";
            ps = con.getConexao().prepareStatement(query);

            ps.setString(1, acessorios.getEtiquetaAcessorio());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
        
        }
    }
}
