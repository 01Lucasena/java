/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Pessoa {
    
    private String cpf;
    private String rg;
    private String dataDeNascimento;

    public Fisica(String cpf, String rg, String dataDeNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Dados da Pessoa Fisica" +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de nascimento: " + dataDeNascimento;
    }
    
    
    
}
