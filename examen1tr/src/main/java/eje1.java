
import java.util.Random;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1DAM&&1DAW
 */
public class eje1 {
    public String generarFechaAleatoria(){
    String Rojo = null;
    Random ran = new Random(); 
    int minval1=1895;
    int maxval1=2021;
    int año = ran.nextInt(maxval1) + minval1;
    
    int minval2=1;
    int maxval2=12;
    int mes = ran.nextInt(maxval2) + minval2;
    
    int minval3=1;
    int maxval3=31;
    int dia=ran.nextInt(maxval3) + minval3;
        if (dia>28&&mes==2) {
           for ( dia = ran.nextInt(maxval3) + minval3; dia > 28; ) {            
        } 
        }
        if (dia==31&&mes==4) {
           for ( dia = ran.nextInt(maxval3) + minval3; dia > 28; ) {           
        } 
        }
        if (dia==31&&mes==6) {
            for ( dia = ran.nextInt(maxval3) + minval3; dia > 28; ) {          
        }
        }
        if (dia==31&&mes==9) {
            for ( dia = ran.nextInt(maxval3) + minval3; dia > 28; ) {          
        }
        }
        if (dia==31&&mes==11) {
           for ( dia = ran.nextInt(maxval3) + minval3; dia > 28; ) {
            
        } 
        }
        
    
    
    
    return Rojo;
    }
}