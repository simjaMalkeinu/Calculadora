/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import org.nfunk.jep.JEP;

/**
 *
 * @author Manue
 */
public class Modelo {
    
    private String operacion;

    public Modelo() {
    }

    public Modelo(String operacion) {
        this.operacion = operacion;
    }
    
    
    
    public float calcular(){
        
        System.out.println(this.operacion);
        Jep jep = new Jep();
        try {
        /*jep.addVariable("x", 10);
        jep.parse("x+1");
        Object result = jep.evaluate();
    			
        System.out.println("x + 1 = " + result);*/
     } catch (JepException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
        
        return 0.0f;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
