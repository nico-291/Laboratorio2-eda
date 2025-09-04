import java.util.Scanner;
import java.itil.Random;

class nodo<T>{
    private T valor;
    private nodo<T> siguiente;
    public nodo(){
        this.valor = null;
        this.siguiente = null;
    }
    public nodo(T valor){
        this.valor = valor;
        this.siguiente = null;
    }
    public nodo(T valor, nodo<T> siguiente){
        this.valor = valor;
        this.siguiente = siguiente;
    }
    public T getValor(){
        return this.valor;
    }
    public void setValor(T valor){
        this.valor = valor;
    }
    public nodo<T> getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}