/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        //instanciando um objeto.
        Clientes cliente = new Clientes("Marta", 18);
        Funcionarios funcionario = new Funcionarios("Lucas", "Gerente", 5000);
        //cliente.nome = "Marta";
        //cliente.idade = 18;
        
        //cliente.setNome("Marta");
        //cliente.setIdade(18);
        
        System.out.println("Dados do Cliente");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        System.out.println("Dados do funcionário");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salário: " + funcionario.getSalario());
                
    }
}
