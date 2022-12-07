/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioCircunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio");
        float radio = leer.nextFloat();
        
        return new Circunferencia(radio);
                
    }
    
    public float area(float radio) {
        
        float area = (float) (PI * Math.pow(radio, 2));
        return area;
    }
    
    public float perimetro(float radio){
        
        float perimetro = (float) (2 * PI * radio);        
        return perimetro;
    } 
    
}
