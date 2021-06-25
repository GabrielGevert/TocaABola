package model;

import dao.ClienteDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;

public class Cliente {

    private Integer idCliente;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String newsletter;
    private Loja loja;

    public Integer getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public Loja getLoja() {
        return loja;
    }

    
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO {
        new ClienteDAO().cadastrarCliente(cliente); 
    }
    
    public ArrayList<Cliente> listarClientes(String cpf) throws ExceptionDAO {
        return new ClienteDAO().listarClientes(cpf);
    }
    
}
