/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04;

/**
 *
 * @author aluno.den
 */
public class Exercicio04 {

    public static void main(String[] args) {
        //declarando variáveis
        String nomeUsuario = "Marta";
        int senha = 123;
        
        //comparação de strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        //exibindo resultados
        System.out.println("O nome do usuário está correto?" + resultadoNome);
        System.out.println("A senha do usuário está correta?" + resultadoSenha);
    }
}
