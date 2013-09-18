/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategysample;

/**
 *
 * @author rudygodoy
 */
public class ComparadorCodigo implements Comparador {
    
    @Override
    public int comparar(Alumno a1, Alumno a2){
        return a1.codigo.compareTo(a2.codigo);
    }
    
}
