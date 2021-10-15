/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

/**
 *
 * @author javip
 */
public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());

    }
    
}
