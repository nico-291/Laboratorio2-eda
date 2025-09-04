import java.util.Scanner;
import java.itil.Random;
//class nodo
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

    public void push(T valor){
    }
    public T pop(){
    }
    piblic T peek(){
    }
    public boolean isEmpty(){
    }
    public String toString(){}
}
class ColaEnlazada{
    Private nodo<T>;

    public bool add(T valor){
    }
    public T pool(){
    }
    public T Peek(){
    }
    public boolean isEmpty(){

    }
}