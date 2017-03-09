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
public class Vaca extends Animal {
      public String muuu;
    @Override
    public String getSonido(){
        return muuu;
    }
    public Vaca (String muuu){
        this.muuu=muuu;
        
    }
    
    
}
