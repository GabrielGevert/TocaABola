package controller;
import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Chuteira;


/**
 *
 * @author gabri
 */
public class ChuteiraController {
    public boolean cadastrarChuteira(String modelo, String cor, String marca, Integer tamanho, Double valor) throws ExceptionDAO {

        if (modelo != null && modelo.length() > 0 && cor != null && cor.length() > 0 && marca != null && marca.length() > 0 && tamanho != null && valor > 0) {

            Chuteira chuteira = new Chuteira();
            chuteira.setModelo(modelo);
            chuteira.setCor(cor);
            chuteira.setMarca(marca);
            chuteira.setTamanho(tamanho);
            chuteira.setValor(valor);

            chuteira.cadastrarChuteira(chuteira);
            return true;
        }
        return false;
    }
    public ArrayList<Chuteira> listarChuteiras(String marca) throws ExceptionDAO {
        return new Chuteira().listarChuteiras(marca); 
    }
    
    public boolean venderChuteira(String etiquetaChuteira) throws ExceptionDAO {
        if (etiquetaChuteira.length() == 0){
            return false;
        }
        else {
            Chuteira chuteira = new Chuteira();
            chuteira.setEtiquetaChuteira(etiquetaChuteira);
            chuteira.venderChuteira(chuteira);
            return true;
        }
    }
}