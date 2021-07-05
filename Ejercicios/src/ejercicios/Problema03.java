/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1;
        double numero2;
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] sumar = new double[5];
        for (int x = 0; x < datos.length; x++) {
            numero1 = datos[x];
            numero2 = datos2[x];
            sumar[x] = obsuma(numero1, numero2);
            System.out.printf("La suma de los datos %.1f y %.1f es: "
                    + "%.2f\n", datos[x],datos2[x], sumar[x]);
        }
    }

    public static double obsuma(double x, double y) {
        if (y == 0) {
            return x;
        } else {
            if (x == 0) {
                return y;
            } else {
                return 1 + obsuma(x, y - 1);
            }
        }
    }
    
}
