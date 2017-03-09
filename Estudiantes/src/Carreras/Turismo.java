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
public class Turismo extends Carrera {
      public double coloramarillo;
    @Override
    public double getColor(){
        return coloramarillo;
    }
    public Turismo (double coloramarillo){
        this.coloramarillo=coloramarillo;
        
    }
    
    
}