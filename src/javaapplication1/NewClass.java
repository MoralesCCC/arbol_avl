/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author LAB6B09
 */
class Nodo {
    int valor;
    int altura;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.altura = 1;
        izquierdo = null;
        derecho = null;
    }
}
