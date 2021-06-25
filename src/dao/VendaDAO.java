package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Venda;

public class VendaDAO {
    
    private Double valor;
    private Conexao con;
    private String query;
    private String query2;
    private String query3;
    private String query4;
    private PreparedStatement ps;
    private PreparedStatement ps2;
    private PreparedStatement ps3;
    private PreparedStatement ps4;
    
    public VendaDAO(){
        con = new Conexao();
    }
    
    public void cadastrarVendas(Venda venda){
        
        try{
            
            query =  "INSERT INTO venda (idFuncionario, cpfCliente, descricaoAcessorio, descricaoBola, descricaoCamiseta, descricaoChuteira, valor) VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, venda.getIdFuncionario());
            ps.setString(2, venda.getCpfCliente());            
            ps.setString(3, venda.getDescricaoAcessorio());
            ps.setString(4, venda.getDescricaoBola());
            ps.setString(5, venda.getDescricaoCamiseta());
            ps.setString(6, venda.getDescricaoChuteira());
            ps.setDouble(7, venda.getValor());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    }
    
    public ArrayList<Venda> listarVendas(String idFuncionario) throws ExceptionDAO {
        ArrayList<Venda> venda = null;
        try {

            String sql = "select * from venda where idFuncionario like '%" + idFuncionario + "%' order by idFuncionario";
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs != null) {
                venda = new ArrayList<Venda>();
                while (rs.next()) {
                    Venda vendas = new Venda();
                    vendas.setIdVenda(rs.getInt("idVenda"));
                    vendas.setIdFuncionario(rs.getString("idFuncionario"));
                    vendas.setCpfCliente(rs.getString("cpfCliente"));
                    vendas.setDescricaoAcessorio(rs.getString("descricaoAcessorio"));
                    vendas.setDescricaoBola(rs.getString("descricaoBola"));
                    vendas.setDescricaoCamiseta(rs.getString("descricaoCamiseta"));
                    vendas.setDescricaoChuteira(rs.getString("descricaoChuteira"));
                    vendas.setValor(rs.getDouble("valor"));
                    venda.add(vendas);
                }
            }

        } catch (SQLException ex) {
            throw new ExceptionDAO("Erro ao consultar vendas: " + ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                throw new ExceptionDAO("Erro ao fechar ps: " + ex);
            }
        }
        return venda;
    }
    public Venda calcularPrecoAcessorio(String etiquetaAcessorio, Double valorAcessorio) throws ExceptionDAO{
        

            try{

                query =  "SELECT valor FROM acessórios where etiquetaAcessorio like '%" + etiquetaAcessorio + "%' order by etiquetaAcessorio";

                ps = con.getConexao().prepareStatement(query);
                ResultSet rs = ps.executeQuery(query);

  
                Venda precoAcessorio = new Venda();
                precoAcessorio.setValorAcessorio(rs.getDouble("valor"));
                
                
                
                return precoAcessorio;
                }               
            
            catch(SQLException ex) {
                throw new ExceptionDAO("Erro ao consultar vendas: " + ex);
            }
    }
                   
}