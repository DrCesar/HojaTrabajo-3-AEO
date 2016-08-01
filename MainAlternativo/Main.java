/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3.sorts.estructuras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author wadeowen
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> numeros = new ArrayList<String>(); 
        Random randNum = new Random();
        int num;
        
        List<String> lines = numeros;
        URL location = Main.class.getResource("Main.class");
        String dir = location.getPath();
        /*Path file = Paths.get(dir.substring(0,dir.indexOf("Main"))+"/numeros.txt");*/
        
        Lista<Integer> lSelection = new Lista<Integer>();
        Lista<Integer> lInsert = new Lista<Integer>();
        Lista<Integer> lMerge = new Lista<Integer>();
        Lista<Integer> lQuick = new Lista<Integer>();
        Sorts<Integer> sort = new Sorts<Integer>();
        /*
        for(int i = 1; i <= 10; i++){
            num = randNum.nextInt(500) + 1;
            numeros.add(Integer.toString(num));
        }
        
        
        try{
            Files.write(file, lines, Charset.forName("UTF-8"));
        }catch(IOException e){
            System.out.println("No se pudo crear el archivo.");
        }*/
        
        
        try(BufferedReader buff = new BufferedReader(new FileReader(dir.substring(0,dir.indexOf("Main"))+"/numeros.txt"))) {
            
            String linea;
            
            while ((linea = buff.readLine()) != null){
                lSelection.add(Integer.parseInt(linea));
                lInsert.add(Integer.parseInt(linea));
                lMerge.add(Integer.parseInt(linea));
                lQuick.add(Integer.parseInt(linea));
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println(lSelection.length());
        
        
        System.out.println("Resultado Selection Sort");
        sort.selectionSortN(lSelection);
        lSelection.print();
        System.out.println("Resultado Insert Sort");
        sort.insertSortN(lInsert);
        lInsert.print();
        System.out.println("Resultado Merge Sort");
        sort.mergeSortN(lMerge,1,lMerge.length());
        lMerge.print();
        System.out.println("Resultado Quick Sort");
        sort.quickSortN(lQuick,1,lQuick.length());
        lQuick.print();
        
    }
    
}
