/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite a 1ª nota: ");
        double primeiraNota = sc.nextDouble();
        
        System.out.println("Digite a 2ª nota: ");
        double segundaNota = sc.nextDouble();
        
        double media = (primeiraNota + segundaNota) / 2;
        
        System.out.println("Nome: " + nome);
        System.out.println("1ª Nota: " + primeiraNota);
        System.out.println("2ª Nota: " + segundaNota);
        System.out.println("media: " + media);
        
        if (media >= 7) {
            
            System.out.println("ALUNO APROVADO");
            
        }else{
            
            System.out.println("ALUNO REPROVADO");
            
        }
                
    }
}
