package arbolbinario;

public class Nodo {

    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(int dato) {
        this.dato = dato;
        izdo = dcho = null;
    }

    public Nodo(int dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izdo = izquierdo;
        this.dcho = derecho;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    

}
