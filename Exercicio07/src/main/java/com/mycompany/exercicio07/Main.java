/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
       
        Conta_bancaria contaBancaria = new Conta_bancaria("Banco 1", "001", "12344567", "Poupança", 50000, 100000);
        Funcionario funcionario1 = new Funcionario(1, "José", "Rua a", "123456", "jose@gmail.com", contaBancaria);
        Funcionario funcionario2 = new Funcionario(2, "Maria", "Rua b", "123654", "maria@gmail.com", 
                new Conta_bancaria("Banco 2", "002", "37546354", "Corrente", 10000, 200000));
        
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Dados da conta bancária: ");
        System.out.println("Banco: " + contaBancaria.getBanco());
        System.out.println("Agência: " + contaBancaria.getAgencia()); 
        
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Dados da conta bancária: ");
        System.out.println("Banco: " + funcionario2.contaBancaria.getBanco());
        System.out.println("Agência: " + funcionario2.contaBancaria.getAgencia());
    }
}
