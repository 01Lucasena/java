/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio13;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Pessoa {
    
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String dataDeNascimento;
    private double salario;

    public Fisica(Sexo sexo, String cpf, String rg, String dataDeNascimento, double salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nDados da Pessoa Física" +
                "\n" + super.nome +
                "\n" + super.telefone +
                "\nSexo: " + sexo + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de Nascimento:" + dataDeNascimento + 
                "\nSalário: " + salario;
    }
       
}
