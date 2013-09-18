/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategysample;

/**
 *
 * @author rudygodoy
 */
public class StrategySample {

    public static void ordenar(Alumno[] alumnos, Comparador c) {
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < i; j++) {
                if (c.comparar(alumnos[i], alumnos[j]) < 0) {
                    Alumno t = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = t;
                }
            }
        }
    }

    public static void imprimir(Alumno[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Alumno[] alumnos = {new Alumno("Juan Medina", 15.8, "A12"),
            new Alumno("María Soto", 14.3, "A13"),
            new Alumno("José Carranza", 15.6, "A14")};

        ordenar(alumnos, new ComparadorNotas());
        imprimir(alumnos);
        System.out.println();
        ordenar(alumnos, new ComparadorNombres());
        imprimir(alumnos);
        System.out.println();
        ordenar(alumnos, new ComparadorCodigo());
        imprimir(alumnos);
    }
}
