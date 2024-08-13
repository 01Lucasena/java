/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("01", "Lucas", 25, "jffkuf", "skjhdgkslh", Sexo.MASCULINO, 
        new Endereco("Rua A", "1", "sla", "1111111", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("Dados da pessoa:");
        System.out.println("ID: " + pessoa.getId());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Endereço: " + pessoa.getEndereco().getLogradouro());
        System.out.println("Endereço: " + pessoa.getEndereco().getNumero());
        System.out.println("Endereço: " + pessoa.getEndereco().getCep());
        
    }
}
