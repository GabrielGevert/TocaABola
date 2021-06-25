package controller;
import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Camiseta;


/**
 *
 * @author gabri
 */
public class CamisetaController {
    public boolean cadastrarCamiseta(String time, String modelo, String tamanho, Double valor) throws ExceptionDAO {

        if (time != null && time.length() > 0 && modelo != null && modelo.length() > 0 && tamanho != null && tamanho.length() > 0 && valor > 0) {

            Camiseta camiseta = new Camiseta();
            camiseta.setTime(time);
            camiseta.setModelo(modelo);
            camiseta.setTamanho(tamanho);
            camiseta.setValor(valor);

            camiseta.cadastrarCamiseta(camiseta);
            return true;
        }
        return false;
    }
    
    public ArrayList<Camiseta> listarCamisetas(String time) throws ExceptionDAO {
        return new Camiseta().listarCamisetas(time); 
    }
    
    public boolean venderCamiseta(String etiquetaCamiseta) throws ExceptionDAO {
        if (etiquetaCamiseta.length() == 0){
            return false;
        }
        else {
            Camiseta camiseta = new Camiseta();
            camiseta.setEtiquetaCamiseta(etiquetaCamiseta);
            camiseta.venderCamiseta(camiseta);
            return true;
        }
    }
}