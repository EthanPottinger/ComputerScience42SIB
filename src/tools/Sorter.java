package tools;

import collections.LinkedList;


/**
 * Sorter.java - 
 *
 * @author Mr. Wachs 
 * @since 7-Feb-2019 
 */
public class Sorter <T extends Comparable<T>> {

    public T[] bubbleSort(T[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                T item1 = array[j];
                T item2 = array[j + 1];
                if(item1.compareTo(item2) > 0) {
                    T item3 = item1;
                    item1 = item2;
                    item2 = item3;
                    array[j] = item1;
                    array[j + 1] = item2;
                }
            }
        }
        
        return array;
    }   
    
    public LinkedList bubbleSort(LinkedList array) {
        return array;
    }  
    
    public T[] selctionSort(T[] array) {
        return array;
    } 
    
    public LinkedList selectionSort(LinkedList array) {
        return array;
    }  
    
}
