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
public class Hexagono extends Figura{
     public double apotema;
    public double lado;
    public double perimetro;
    @Override
    public double getArea(){
        return (perimetro*apotema)/2;
    }
    public double getPerimetro(){
        return lado*6;
    }
    
    public Hexagono (double apotema, double lado, double perimetro){
        this.apotema=apotema;
        this.lado=lado;
        this.perimetro=perimetro;
    }
   

        
    
        
           
  
}
