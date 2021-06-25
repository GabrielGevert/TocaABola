package model;

import dao.VendaDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Venda {
    private Integer idVenda;
    private String idFuncionario;
    private String cpfCliente;
    private String descricaoAcessorio;
    private String descricaoBola;
    private String descricaoCamiseta;
    private String descricaoChuteira;
    private Double valor;
    
    private Double valorAcessorio;
    private Double valorBola;
    private Double valorCamiseta;
    private Double valorChuteira;

    public Integer getIdVenda() {
        return idVenda;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getDescricaoAcessorio() {
        return descricaoAcessorio;
    }

    public String getDescricaoBola() {
        return descricaoBola;
    }

    public String getDescricaoCamiseta() {
        return descricaoCamiseta;
    }

    public String getDescricaoChuteira() {
        return descricaoChuteira;
    }

    public Double getValor() {
        return valor;
    }

    public Double getValorAcessorio() {
        return valorAcessorio;
    }

    public Double getValorBola() {
        return valorBola;
    }

    public Double getValorCamiseta() {
        return valorCamiseta;
    }

    public Double getValorChuteira() {
        return valorChuteira;
    }
    
    

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setDescricaoAcessorio(String descricaoAcessorio) {
        this.descricaoAcessorio = descricaoAcessorio;
    }

    public void setDescricaoBola(String descricaoBola) {
        this.descricaoBola = descricaoBola;
    }

    public void setDescricaoCamiseta(String descricaoCamiseta) {
        this.descricaoCamiseta = descricaoCamiseta;
    }

    public void setDescricaoChuteira(String descricaoChuteira) {
        this.descricaoChuteira = descricaoChuteira;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setValorAcessorio(Double valorAcessorio) {
        this.valorAcessorio = valorAcessorio;
    }

    public void setValorBola(Double valorBola) {
        this.valorBola = valorBola;
    }

    public void setValorCamiseta(Double valorCamiseta) {
        this.valorCamiseta = valorCamiseta;
    }

    public void setValorChuteira(Double valorChuteira) {
        this.valorChuteira = valorChuteira;
    }
    
    

    
    public void cadastrarVendas(Venda venda) throws ExceptionDAO {
        new VendaDAO().cadastrarVendas(venda); 
    }
    
    public ArrayList<Venda> listarVendas(String idFuncionario) throws ExceptionDAO {
        return new VendaDAO().listarVendas(idFuncionario);
    }
    
   public Double calcularPrecoAcessorio(String etiquetaAcessorio, Double valorAcessorio) throws ExceptionDAO{
        new VendaDAO().calcularPrecoAcessorio(etiquetaAcessorio, valorAcessorio);
        return valorAcessorio;
   }
}



