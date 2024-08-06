/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Pet1 pet1 = new Pet1("Lulu", 5, "Vira-Lata", "médio", "ração");
        Pet2 pet2 = new Pet2("Cosme", 3, "Golden", "grande", "bife");
        
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
        
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());
    }
}
