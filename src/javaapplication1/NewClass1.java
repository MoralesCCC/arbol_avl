/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author LAB6B09
 */class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor)
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertarNodo(nodo.derecho, valor);

        return nodo;
    }

    public void imprimirOrdenado() {
        imprimirOrdenadoRecursivo(raiz);
    }

    private void imprimirOrdenadoRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirOrdenadoRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirOrdenadoRecursivo(nodo.derecho);
        }
    }
    public void imprimirEnOrden() {
        imprimirEnOrdenRecursivo(raiz);
        System.out.println();
    }

    private void imprimirEnOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrdenRecursivo(nodo.derecho);
        }
    }
    public void imprimirPreOrden() {
        imprimirPreOrdenRecursivo(raiz);
        System.out.println();
    }

    private void imprimirPreOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            imprimirPreOrdenRecursivo(nodo.izquierdo);
            imprimirPreOrdenRecursivo(nodo.derecho);
        }
    }

    public void imprimirPosOrden() {
        imprimirPosOrdenRecursivo(raiz);
        System.out.println();
    }

    private void imprimirPosOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirPosOrdenRecursivo(nodo.izquierdo);
            imprimirPosOrdenRecursivo(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

}
