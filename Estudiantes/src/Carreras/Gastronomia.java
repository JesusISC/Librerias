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
public class Gastronomia extends Carrera {
      public double colorblanco;
    @Override
    public double getColor(){
        return colorblanco;
    }
    public Gastronomia (double colorblanco){
        this.colorblanco=colorblanco;
        
    }
    
    
}