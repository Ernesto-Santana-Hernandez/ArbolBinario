/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Lenovo
 */
public class Arbol {

    private Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void agregar(Nodo nodo, Nodo raiz) {
        if (raiz == null) {
            this.setRaiz(nodo);
        } else {
            if (nodo.getDato() <= raiz.getDato()) {
                if (raiz.getIzdo() == null) {
                    raiz.setIzdo(nodo);

                } else {
                    agregar(nodo, raiz.getIzdo());
                }
            } else {
                if (raiz.getDcho() == null) {
                    raiz.setDcho(nodo);
                } else {
                    agregar(nodo, raiz.getDcho());
                }
            }
        }
    }

    public void agregarNodo(Nodo nodo) {
        this.agregar(nodo, this.raiz);
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.println("Datos: " + nodo.getDato());
            recorrerPreorden(nodo.getIzdo());
            recorrerPreorden(nodo.getDcho());
        }
    }

    public void recorrerPosorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerPosorden(nodo.getIzdo());
            recorrerPosorden(nodo.getDcho());
            System.out.println("Datos: " + nodo.getDato());
        }
    }

    public void recorrerInorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerInorden(nodo.getIzdo());
            System.out.println("Datos: " + nodo.getDato());
            recorrerInorden(nodo.getDcho());
        }
    }
}
