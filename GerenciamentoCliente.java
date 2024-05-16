
package com.mycompany.trabalho2bimestre;

import java.util.ArrayList;
import java.util.List;


public class GerenciamentoCliente {
    
    private String nome;
    
    private String telefone; 
            
    private String email;
    
    private List<GerenciamentoTreino> treinos = new ArrayList<>();

    public GerenciamentoCliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public void addTreino(GerenciamentoTreino treino) {
        treinos.add(treino);
    }
 
    public List<GerenciamentoTreino> getTreinos(){
        return treinos;
    }
            
    public boolean removeTreino(GerenciamentoTreino treino) {
        return treinos.remove(treino);
    }
    
}
