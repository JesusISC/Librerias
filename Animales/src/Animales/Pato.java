/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author CECII
 */
public class Pato extends Animal {
      public String cuac;
    @Override
    public String getSonido(){
        return cuac;
    }
    public Pato (String cuac){
        this.cuac=cuac;
        
    }
    
    
}
