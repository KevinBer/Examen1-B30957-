/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class DBPersonaPais <T> {
        
    private ArrayList<T> arrayList;
       
    public DBPersonaPais(){
        arrayList = new ArrayList<T>();
        
    }
    public void agregar(T tipo){
       arrayList.add(tipo);
    }
    public int size(){
        return arrayList.size();
    }
    public T obtenerPos(int posc){
        return arrayList.get(posc);
    }
    public T getArray(){
        T tipo = null;
        for(int i=0; i< arrayList.size(); i++){
           tipo = arrayList.get(i);
        }
        return tipo;
    }
    
}
