/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio13;

import java.time.LocalDate;

/**
 *
 * @author aluno.den
 */
public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "\nJuridica" + 
                "\n" + super.nome +
                "\n" + super.telefone +
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual + 
                "\nData Início: " + dataInicio + 
                "\nData Término: " + dataTermino + 
                "\nValor do Contrato:" + valorContrato;
    }

}
