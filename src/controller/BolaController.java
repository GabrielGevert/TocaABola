package controller;
import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Bola;

/**
 *
 * @author gabri
 */
public class BolaController {
    public boolean cadastrarBola(String modelo, String marca, Double valor) throws ExceptionDAO {

        if (modelo != null && modelo.length() > 0 && marca != null && marca.length() > 0 && valor > 0) {

            Bola bola = new Bola();
            bola.setModelo(modelo);
            bola.setMarca(marca);
            bola.setValor(valor);

            bola.cadastrarBola(bola);
            return true;
        }
        return false;
    }
    
    public ArrayList<Bola> listarBolas(String modelo) throws ExceptionDAO {
        return new Bola().listarBolas(modelo); 
    }
    
    public boolean venderBola(String etiquetaBola) throws ExceptionDAO {
        if (etiquetaBola.length() == 0 ){
            return false;
        }
        else {
            Bola bola = new Bola();
            bola.setEtiquetaBola(etiquetaBola);
            bola.venderBola(bola);
            return true;
        }
    }
}
