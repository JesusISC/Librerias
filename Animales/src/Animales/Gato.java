/*iau
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author CECII
 */
public class Gato extends Animal {
    public String miau;
    @Override
    public String getSonido(){
        return miau;
    }
    public Gato (String miau){
        this.miau=miau;
        
    }
    
}
