
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
    String Res = null;
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
        String sA = String.valueOf(año);
        String sB = String.valueOf(mes);
        String sC = String.valueOf(dia);
        Res= sC+"/"+sB+"/"+"/"+sA;
        

    
    
    return Res;
    }
    public String apellidoAleatorio(){
     Random ran = new Random(); 
     String[] apellidosPosibles = new String[] {"rodrigues", "martines", "Cabrera", "Jara", "Cruz","Kaur","Pedrosa","Nogales","Velasco","Vico","Herreros","Belmonte","Sevilla","Grau","Patiño","Abad","Portela","Montes","Ruiz","Ortega"};    
     int apellido= ran.nextInt(apellidosPosibles.length);
     String res = String.valueOf(apellido);
     
     
    return res;}
}