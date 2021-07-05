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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] resultado = new double[4][2];
        double x;
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        for (int z = 0; z < 4; z++) {
            for (int w = 0; w < 2; w++) {
                x = datos[z][w];
                resultado[z][w] = factoriales(x);
                System.out.printf("El factorial de: %.2f es: %.2f\n",
                        datos[z][w], factoriales(x));
            }
        }
    }

    public static double factoriales(double valor) {
        if (valor <= 1) {
            return 1;
        } else {
            return valor * factoriales(valor - 1);
        }
    }
}
