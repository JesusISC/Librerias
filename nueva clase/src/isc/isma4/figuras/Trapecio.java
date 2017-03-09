/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author CECII
 */
public class Trapecio extends Figura {
    public double ladomayor;
    public double ladomenor;
    public double altura;
    @Override
    public double getArea(){
        return (ladomayor*ladomenor)/2*altura;
    }
    public Trapecio (double ladomayor, double ladomenor, double altura){
        
        
        this.ladomayor=ladomayor;
        this.ladomenor=ladomenor;
        this.altura=altura;
        
    }
    
     
}
