package modelo;

import com.singularsys.jep.Jep;
import com.singularsys.jep.JepException;

public class Modelo {

    private String operacion;
    private Object result;

    public Modelo() {
    }

    public Modelo(String operacion) {
        this.operacion = operacion;
    }

    public Object calcular() {

        System.out.println(this.operacion);
        Jep jep = new Jep();
        try {
            jep.parse(this.operacion);
            result = jep.evaluate();

            System.out.println(this.operacion + " = " + this.result);
        } catch (JepException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return this.result;
    }

    public Object getResult() {
        return this.result;
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
