/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author LAB6B09
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        ArbolBinario arbol = new ArbolBinario();
        int dat;
        System.out.println("cuantos nodos quieres crear");
        int nod =sc.nextInt();
        
        System.out.println("ingresa los datos");
        for (int i = 0; i < nod; i++) {
            dat= sc.nextInt();
            arbol.insertar(dat);
        }
        
        // Imprimir los datos ordenados
        System.out.println("Datos ordenados:");
        arbol.imprimirEnOrden();
        System.out.println("Datos en preorden:");
        arbol.imprimirPreOrden();
        System.out.println("Datos en posorden:");
        arbol.imprimirPosOrden();
    
    }

}
