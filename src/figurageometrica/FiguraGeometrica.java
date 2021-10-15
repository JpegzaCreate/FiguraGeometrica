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
public abstract class FiguraGeometrica {
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
        
    }
    
    public abstract void dibujar();
    
    
    
}
