package controlador;
import org.nfunk.jep.JEP;
public class controlador {
    public String validar(String expresion){

        JEP jep = new JEP(); //JEP es un parser para expresiones matemáticas
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.parseExpression(expresion); //le pedimos que analice la expresión
        //Si la expresión tiene error, se vuelve nula
        if (jep.hasError()){
            //poner "error" en vista
            expresion = null;
        }
        return expresion;
    }
}