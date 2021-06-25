package model;

import dao.ChuteiraDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Chuteira {

    private String etiquetaChuteira;
    private String modelo;
    private String cor;
    private String marca;
    private Integer tamanho;
    private Double valor;
    private Loja loja;

    public String getEtiquetaChuteira() {
        return etiquetaChuteira;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    
    
    
    public void setEtiquetaChuteira(String etiquetaChuteira) {
        this.etiquetaChuteira = etiquetaChuteira;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
    public void cadastrarChuteira (Chuteira chuteira) throws ExceptionDAO {
        new ChuteiraDAO().cadastrarChuteira(chuteira); 
    }
    
    public ArrayList<Chuteira> listarChuteiras(String marca) throws ExceptionDAO {
        return new ChuteiraDAO().listarChuteiras(marca);
    }
    public void venderChuteira(Chuteira chuteira) throws ExceptionDAO {
        new ChuteiraDAO().venderChuteira(chuteira);
    }
}
