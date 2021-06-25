package model;

import dao.BolaDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Bola {

    private String etiquetaBola;
    private String modelo;
    private String marca;
    private Double valor;
    private Loja loja;
    
    public Bola() {
        
    }
    public String getEtiquetaBola() {
        return etiquetaBola;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    
    
    
    
    
    public void setEtiquetaBola(String etiquetaBola) {
        this.etiquetaBola = etiquetaBola;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public void cadastrarBola(Bola bola) throws ExceptionDAO {
        new BolaDAO().cadastrarBola(bola); 
   }
    public ArrayList<Bola> listarBolas(String modelo) throws ExceptionDAO {
        return new BolaDAO().listarBolas(modelo);
    }
    public void venderBola(Bola bola) throws ExceptionDAO {
        new BolaDAO().venderBola(bola);
    }
}
