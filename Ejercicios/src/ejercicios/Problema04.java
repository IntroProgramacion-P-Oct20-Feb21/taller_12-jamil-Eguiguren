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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double suma=0;
        double base;
        double potencia;
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int x = 0; x < 5; x++) {
            base = bases[x];
            potencia = potencias[x];
            resultado[x] = obpotencia(base, potencia);
            suma = obsuma(resultado ,resultado.length);
            System.out.printf("%.1f elevado a %.1f = %.1f\n",
                    bases[x], potencias[x], resultado[x]);
        }
        System.out.printf("La suma del arreglo resultado es: "
                + "%.1f\n",suma);
    }

    public static double obpotencia(double x, double z) {

        if (z == 1) {
            return x;
        } else {
            return x * obpotencia(x, z - 1);
        }
    }
    public static double obsuma(double [] x, int z) {
        if (z == 1) {
            return x[0];
        } else {
            return x[z - 1] + obsuma(x, z - 1);
        }
    }
    
}

