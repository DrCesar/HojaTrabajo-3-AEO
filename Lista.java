/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3.sorts.estructuras;

/**
 *
 * @author wadeowen
 * @param <T>
 */
public class Lista<T extends Comparable>{
    
    private Nodo<T> raiz;
    private T[] vector;
    
    public Lista(){
    }
    
    public Lista(T i){
        raiz.setInfo(i);
        raiz = null;
    }
    
    public void add(T i){
        if(raiz == null){
            raiz = new Nodo<>(i);
        } else {
            Nodo<T> temp;
            temp = raiz;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            Nodo<T> n = new Nodo<>(i);
            n.setPre(temp);
            temp.setNext(n);
        }
    }
    
    public int length(){
        Nodo<T> temp = raiz;
        int len = 0;
        while (temp != null){
            temp = temp.getNext();
            len++;
        }
        return len;
    }
    
    public Nodo getNodo(int i){
        Nodo<T> temp = raiz;
        int cont = 1;
        
        while(cont < i && temp != null){
            temp = temp.getNext();
            cont++;
        }
        
        return temp;
    }
    
    public void setNodo(Nodo<T> p, int i){
        Nodo<T> temp = raiz;
        int cont = 1;
        
        while(cont < i && temp.getNext() != null){
            temp = temp.getNext();
            cont++;
        }
        if(p!=null)
            temp.setInfo(p.getInfo());
    }

    
    public Nodo getRaiz(){
        return this.raiz;
    }
    
    public void listToVector(){
        
    }
    
    public void swapNodos(Nodo<T> p, Nodo<T> n){
        Nodo<T> temp = new Nodo<>();
        
        if(n!=null)
            temp.setInfo(n.getInfo());
        if(p!=null && n!=null)
            n.setInfo(p.getInfo());
        if(p!=null)
            p.setInfo(temp.getInfo());
    }
    
    
    public void print(){
        Nodo<T> temp = raiz;
        int cont = 1;
        
        while(temp != null){
            cont++;
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }
    
    
    public void selectionSortN(){
        
        Nodo<T> temp;
        
        //temp = raiz;
        for(int i = 1; i <= length(); i++){
            int infLimit = i;
           
            for(int j = i + 1; j <= length(); j++){
                if(getNodo(infLimit).getInfo().compareTo(getNodo(j).getInfo()) > 0){
                    infLimit = j;
                }
            }
            
            if (infLimit != i){
                swapNodos(getNodo(infLimit),getNodo(i));
            }
        }
    }
}
