/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dropwizardprueba;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Saying2 {
    
    private String nombre;
    
    public Saying2(String nombre) {
        this.nombre = nombre;
    }
    
    @JsonProperty
    public String getNombre() {
        return nombre;
    }
    
}
