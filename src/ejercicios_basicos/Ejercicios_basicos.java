/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_basicos;

import java.util.Scanner;

/**
 *
 * @author CxrlosMX
 */
public class Ejercicios_basicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el limite de escalones");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
