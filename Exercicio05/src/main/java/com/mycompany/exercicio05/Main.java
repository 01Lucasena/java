/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        
        Livro livro = new Livro("Como treinar o seu dragão", "Lucas", 300, 250);
        Livro2 livro2 = new Livro2("Percy Jackson", "sla", 400, 300);
        
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Numero de páginas: " + livro.getNumeroDePaginas());
        System.out.println("Preço: " + livro.getPreco());
        
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Numero de páginas: " + livro2.getNumeroDePaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}
