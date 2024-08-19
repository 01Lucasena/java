/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.erxercicio12;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("6356354", "José", "213763648", "218374746", 3000);
        Engenheiro engenheiro = new Engenheiro("6354643261", "João", "8273585", "83926425", 9000);
        Medico medico = new Medico("7653478243", "Joaquim", "87235437", "23548532", 12000);
        
        System.out.println(motoboy.toString());
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
        
    }
}
