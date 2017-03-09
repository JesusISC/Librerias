
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
public class Industrias extends Carrera {
      public double azulmarino;
    @Override
    public double getColor(){
        return azulmarino;
    }
    public Industrias (double azulmarino){
        this.azulmarino=azulmarino;
        
    }
    
    
}