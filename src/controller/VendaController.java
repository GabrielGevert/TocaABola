package controller;

import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Venda;


public class VendaController {
    
    private Double valor;
    
    public boolean cadastrarVendas(String idFuncionario, String cpfCliente, String descricaoAcessorio, String descricaoBola, String descricaoCamiseta, String descricaoChuteira, Double valor) throws ExceptionDAO {

        if (idFuncionario.length() > 0 && valor > 0 && valor != null) {

            Venda venda = new Venda();
            venda.setIdFuncionario(idFuncionario);
            venda.setCpfCliente(cpfCliente);
            venda.setDescricaoAcessorio(descricaoAcessorio);
            venda.setDescricaoBola(descricaoBola);
            venda.setDescricaoCamiseta(descricaoCamiseta);
            venda.setDescricaoChuteira(descricaoChuteira);
            venda.setValor(valor);

            venda.cadastrarVendas(venda);
            return true;
        }
        return false;
    }
    
    public ArrayList<Venda> listarVendas(String idFuncionario) throws ExceptionDAO {
        return new Venda().listarVendas(idFuncionario); 
    }
    
    public boolean calcularPrecoAcessorio(String etiquetaAcessorio, Double valorAcessorio) throws ExceptionDAO {        
        Venda venda = new Venda();
        venda.setValorAcessorio(valorAcessorio);
        
        venda.calcularPrecoAcessorio(etiquetaAcessorio, valorAcessorio);
        return true;
        
    }
}
