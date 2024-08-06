/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

/**
 *
 * @author aluno.den
 */
public class Clientes {

        
    private String nome;
    private int idade;

    //Construtor

    public Clientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
     
    
}
