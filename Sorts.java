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
    
    public void insertSort(Comparable[] datos){
        
        Comparable temp;
        
        
        for(int i = 0; i > datos.length; i++){
            int j = i;
            
            while(datos[j].compareTo(datos[j-1]) < 0 && j >= 0){
                temp = datos[j];
                datos[j] = datos[j-1];
                datos[j-1] = datos[j];
            }    
        }
    }
    
    public Lista selectionSortN(Lista<T> l){
        
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
        
        return l;
    }
    
    public void selectionSort(Comparable[] datos){
        
        Comparable temp;
        
        for(int i = 0; i <= datos.length; i++){
            int infLimit = i;
            
            for(int j = i + 1; j <= datos.length; j++){
                if(datos[infLimit].compareTo(datos[j]) < 0)
                        infLimit = j;
            }
            
            temp =datos[infLimit];
            datos[infLimit] = datos[i];
            datos[i] = temp;
        }
    }
    
    public void mergeSort(Comparable[] datos){
        
        Comparable temp;
        
        
    }
    
    
    public void bubbleSort(Comparable[] datos){
        
        boolean band;
        
        
    }
    
}
