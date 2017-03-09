/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carreras;

/**
 *
 * @author CECII
 */
public class Administracion extends Carrera {
      public double colorrojo;
    @Override
    public double getColor(){
        return colorrojo;
    }
    public Administracion (double colorrojo){
        this.colorrojo=colorrojo;
        
    }
    
    
}
