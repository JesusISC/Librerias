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
public class Energias extends Carrera {
      public double colornegro;
    @Override
    public double getColor(){
        return colornegro;
    }
    public Energias (double colornegro){
        this.colornegro=colornegro;
        
    }
    
    
}