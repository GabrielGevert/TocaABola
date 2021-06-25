package controller;

import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author gabri
 */
public class ClienteController {
    public boolean cadastrarCliente(String nome, String email, String cpf, String telefone, String newsletter) throws ExceptionDAO {

        if (nome != null && nome.length() > 0 && email != null && email.length() > 0 && cpf != null && cpf.length() > 0 && telefone != null && telefone.length() > 0 &&  newsletter != null) {

            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setNewsletter(newsletter);

            cliente.cadastrarCliente(cliente);
            return true;
        }
        return false;
    }
    public ArrayList<Cliente> listarClientes(String cpf) throws ExceptionDAO {
        return new Cliente().listarClientes(cpf); 
    }
}
