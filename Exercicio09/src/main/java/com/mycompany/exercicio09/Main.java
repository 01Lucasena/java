/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio09;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("001", "Lucas", 3000, Setor.FINANCEIRO, Sexo.MASCULINO, 25);
        Funcionario funcionario2 = new Funcionario("002", "Marta", 3000, Setor.VENDAS, Sexo.FEMININO, 21);
        
        System.out.println("Dados do funcionário: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor().getTexto());
        System.out.println("Sexo: " + funcionario1.getSexo().getTexto());
        System.out.println("Idade: " + funcionario1.getIdade());
 
        System.out.println("\nDados do funcionário: ");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Id: " + funcionario2.getId());
        System.out.println("Salario: " + funcionario2.getSalario());
        System.out.println("Setor: " + funcionario2.getSetor().getTexto());
        System.out.println("Sexo: " + funcionario2.getSexo().getTexto());
        System.out.println("Idade: " + funcionario2.getIdade());
        
    }
}
