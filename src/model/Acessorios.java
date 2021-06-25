package model;

import dao.AcessoriosDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Acessorios {

    private String etiquetaAcessorio;
    private String descricao;
    private Double valor;
    private Loja loja;

    public String getEtiquetaAcessorio() {
        return etiquetaAcessorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    
    
    
    public void setEtiquetaAcessorio(String etiquetaAcessorio) {
        this.etiquetaAcessorio = etiquetaAcessorio;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    
    
    
    public void cadastrarAcessorios(Acessorios acessorios) throws ExceptionDAO {
        new AcessoriosDAO().cadastrarAcessorios(acessorios);

    }

    public ArrayList<Acessorios> listarAcessorios(String descricao) throws ExceptionDAO {
        return new AcessoriosDAO().listarAcessorios(descricao);
    }

    public void venderAcessorios(Acessorios acessorios) throws ExceptionDAO {
        new AcessoriosDAO().venderAcessorios(acessorios);
    }
}