/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio07;

/**
 *
 * @author aluno.den
 */
public class Funcionario {
    
    private int codigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    Conta_bancaria contaBancaria;

    public Funcionario(int codigoFuncionario, String nome, String endereco, String telefone, String email, Conta_bancaria contaBancaria) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta_bancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(Conta_bancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

   
    
    
    
}
