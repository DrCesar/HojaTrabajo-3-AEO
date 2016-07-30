/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3.sorts.estructuras;

import java.util.ArrayList;

/**
 *
 * @author wadeowen
 */
public class Sorts<T extends Comparable> {
    
    
    public void Sorts(){
        
    }
    
    public void insertSortN(Lista<T> l){
        
        Nodo<T> temp;
        
        
        for(int i = 2; i <= l.length(); i++){
            int j = i;
            
            while(l.getNodo(j).getInfo().compareTo(l.getNodo(j-1).getInfo()) < 0 && j > 1){
                l.swapNodos(l.getNodo(j-1), l.getNodo(j));
                j--;
            }  
            
        }
    }
    
    public void selectionSortN(Lista<T> l){
        
        Nodo<T> temp;
        
        for(int i = 1; i <= l.length(); i++){
            int infLimit = i;
            
            for(int j = i + 1; j <= l.length(); j++){
                if(l.getNodo(infLimit).getInfo().compareTo(l.getNodo(j).getInfo()) > 0)
                        infLimit = j;
            }
            
            if(infLimit != i)
                l.swapNodos(l.getNodo(infLimit),l.getNodo(i));
        }
    }
    
    public Lista mergeSortN(Lista<T> l, int ini, int len){
        
        Nodo<T> temp;
        
        if(len == 1){
            return l;
        }else{
            Lista<T> l1 = mergeSortN(l,ini,len/2);
            Lista<T> l2 = mergeSortN(l,ini+len/2,len-len/2);
            Lista<T> lFinal = new Lista<>();
            int n1 = ini;
            int n2 = ini+len/2;

            for(int i = ini; i < ini+len; i++){
                if(n1 < ini+len/2){
                    if(n2 < ini+len){
                        if(l1.getNodo(n1).getInfo().compareTo(l2.getNodo(n2).getInfo()) > 0){
                            lFinal.add((T) l2.getNodo(n2).getInfo());
                            n2++;
                        }else{
                            lFinal.add((T) l1.getNodo(n1).getInfo());
                            n1++;
                        }
                    }else{
                        lFinal.add((T) l1.getNodo(n1).getInfo());
                        n1++;
                    }
                }else{
                    lFinal.add((T) l2.getNodo(n2).getInfo());
                    n2++;
                }
            }
            for(int i = 1; i<=lFinal.length();i++)
                l.setNodo(lFinal.getNodo(i), ini+i-1);
            
            return l;
        }   
    }
    
    
    public void bubbleSortN(Lista<T> l){
        
        boolean band = true;
        Nodo<T> temp;
        
        while(band){
            band = false;
            for(int i = 1; i < l.length(); i++){
                if(l.getNodo(i).getInfo().compareTo(l.getNodo(i+1).getInfo()) > 0){
                   l.swapNodos(l.getNodo(i), l.getNodo(i+1));
                   band = true;
                }
            }
        }
    }
    
    public void quickSortN(Lista<T> l,int ini, int fin){
        
        Nodo<T> pivot = l.getNodo(fin);
        int j = ini;
        
        for(int i = ini; i < fin; i++){
            if(l.getNodo(i).getInfo().compareTo(pivot.getInfo()) < 0){
                l.swapNodos(l.getNodo(i),l.getNodo(j));
                j++;
            }
        }
        l.swapNodos(l.getNodo(fin),l.getNodo(j));
        
        if(ini<j-1)
            quickSortN(l,ini,j-1);
        
        if(j+1<fin)
            quickSortN(l,j+1,fin);
        
        
    }
    
}
