package controller;

import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Acessorios;

/**
 *
 * @author gabri
 */
public class AcessoriosController {

    public boolean cadastrarAcessorios(String descricao, Double valor) throws ExceptionDAO {

        if (descricao != null && descricao.length() > 0 && valor > 0 && valor != null) {

            Acessorios acessorios = new Acessorios();
            acessorios.setDescricao(descricao);
            acessorios.setValor(valor);

            acessorios.cadastrarAcessorios(acessorios);
            return true;
        }
        return false;
    }
    
    public ArrayList<Acessorios> listarAcessorios(String descricao) throws ExceptionDAO {
        return new Acessorios().listarAcessorios(descricao);
    }
    
    public boolean venderAcessorio(String etiquetaAcessorio) throws ExceptionDAO {
        if (etiquetaAcessorio.length() == 0){
            return false;
        }
        else {
            Acessorios acessorio = new Acessorios();
            acessorio.setEtiquetaAcessorio(etiquetaAcessorio);
            acessorio.venderAcessorios(acessorio);
            return true;
        }
    }
}
