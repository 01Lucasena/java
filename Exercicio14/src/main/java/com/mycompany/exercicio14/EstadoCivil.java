/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio14;

/**
 *
 * @author aluno.den
 */
public enum EstadoCivil{
    
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    DIVORCIADO("Separado"),
    SEPARADO("Divorciado"),
    VIUVO("Viúvo");
    
    private String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public static EstadoCivil getSOLTEIRO() {
        return SOLTEIRO;
    }

    public static EstadoCivil getCASADO() {
        return CASADO;
    }

    public static EstadoCivil getDIVORCIADO() {
        return DIVORCIADO;
    }

    public static EstadoCivil getSEPARADO() {
        return SEPARADO;
    }

    public static EstadoCivil getVIUVO() {
        return VIUVO;
    }

    public String getTexto() {
        return texto;
    }
    

}
    