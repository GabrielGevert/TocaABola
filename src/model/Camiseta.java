package model;

import dao.CamisetaDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Camiseta {
	
	private String etiquetaCamiseta;
	private String time;
	private String modelo;
	private String tamanho;
	private Double valor;
	private Loja loja;
    
    public Camiseta() {
        
    }
    public String getEtiquetaCamiseta() {
        return etiquetaCamiseta;
    }

    public String getTime() {
        return time;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }


    

    public void setEtiquetaCamiseta(String etiquetaCamiseta) {
        this.etiquetaCamiseta = etiquetaCamiseta;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
        
    public void cadastrarCamiseta (Camiseta camiseta) throws ExceptionDAO {
        new CamisetaDAO().cadastrarCamiseta(camiseta); 
    }
    
    public ArrayList<Camiseta> listarCamisetas(String time) throws ExceptionDAO {
        return new CamisetaDAO().listarCamisetas(time);
    }
    public void venderCamiseta(Camiseta camiseta) throws ExceptionDAO {
        new CamisetaDAO().venderCamiseta(camiseta);
    }
}
