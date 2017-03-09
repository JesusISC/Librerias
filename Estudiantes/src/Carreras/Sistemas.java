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
public class Sistemas extends Carrera {
      public double colorazul;
    @Override
    public double getColor(){
        return colorazul;
    }
    public Sistemas (double colorazul){
        this.colorazul=colorazul;
        
    }
    
    
}
