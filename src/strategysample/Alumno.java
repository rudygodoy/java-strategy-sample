package strategysample;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rudygodoy
 */
public class Alumno {

    String nombres;
    Double nota;
    String codigo;

    public Alumno() {
    }

    public Alumno(String nombres, Double nota, String codigo) {
        this.nombres = nombres;
        this.nota = nota;
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return "{" + codigo + "," + nombres + "," + nota + "}";
    }

    public static void ordenar(Alumno[] a, Comparador c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (c.comparar(a[i], a[j]) < 0) {
                    Alumno t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
