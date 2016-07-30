/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3.sorts.estructuras;

/**
 *
 * @author wadeowen
 */
public class Nodo<T extends Comparable> {
    
    private T info;
    private Nodo next;
    private Nodo pre;
    
    
    public Nodo(){
        next = null;
        pre = null;
    }
    
    public Nodo(T s){
        info = s;
        next = null;
        pre = null;
    }
    
    public Nodo<T> getNext(){
        return this.next;
    }
    
    public void setNext(Nodo<T> n){
        this.next = n;
    }
    
    public Nodo<T> getPre(){
        return this.pre;
    }
    
    public void setPre(Nodo<T> n){
        this.pre = n;
    }
    
    public T getInfo(){
        return this.info;
    }
    
    public void setInfo(T s){
        this.info = s;
    }
    
}
