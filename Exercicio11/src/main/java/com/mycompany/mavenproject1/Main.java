/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
       
        Fisica pessoaFisica = new Fisica("123.456.789-00", "123456789", "18/10/1999", "Lucas", "(12) 3456789");
        Juridica pessoaJuridica = new Juridica("00000000000", "00008932789", "Lucas", "(12) 3456789");
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}
