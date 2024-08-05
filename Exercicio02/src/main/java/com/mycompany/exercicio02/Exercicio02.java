/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio02 {

    public static void main(String[] args) {
        
        double menorNumero , maiorNumero;
        
        
        
        System.out.println("Digite o 1º número:");
        Scanner sc = new Scanner(System.in);
        
        double primeiroNumero = sc.nextDouble();
        
        System.out.println("Digite o 2º número:");
        Scanner sc2 = new Scanner(System.in);
        
        double segundoNumero = sc2.nextDouble();
        
        if (primeiroNumero > segundoNumero) {
            
           maiorNumero = primeiroNumero;
           menorNumero = segundoNumero;
            
        }else{
            
            maiorNumero = segundoNumero;
            menorNumero = primeiroNumero;
        }
        
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
    }
}
