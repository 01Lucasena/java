/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio13;

import java.time.LocalDate;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Fisica pessoaFisica = new Fisica(Sexo.MASCULINO, 
                "123682161826", 
                "2615378621532", 
                "18/10/1999", 
                5000, 
                00001, 
                "Lucas", 
                "(11)123456789",
                new Endereco("Rua A", 
                        "01", 
                        "sla", 
                        "1000000", 
                        "Salvador", 
                        UnidadeFederativa.BAHIA));
        
        Juridica pessoaJuridica = new Juridica("82634879525", 
                "82137597253", 
                LocalDate.MIN, 
                LocalDate.MIN, 
                80000, 
                0001, 
                "AJFF", 
                "KjhgAK", 
                new Endereco("Rua B", 
                        "2", 
                        "aha", 
                        "2123412", 
                        "Rio de Janeiro", 
                        UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
        
    }
}
