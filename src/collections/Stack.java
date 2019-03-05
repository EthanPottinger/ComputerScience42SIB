package collections;

import java.io.Serializable;

/**
 *
 * @author e.pottinger
 */
public class Stack <T> implements Serializable, Comparable<Stack> {
    
    private Node top;
    private int length;
    
    public Stack() {
        top = null;
        length = 0;
    }
    public Stack(LinkedList list) {
        top = null;
        length = 0;
        for(int i = 0; i < list.size(); i++) {
            push((T)list.get(i));
        }
    }
    public Stack(T[] array) {
        top = null;
        length = 0;
        for(int i = 0; i < array.length; i++) {
            push(array[i]);
        }
    }
    public Stack(Queue queue) {
        top = null;
        length = 0;
        for(int i = 0; i < queue.size(); i++) {
            push((T)queue.dequeue());
        }
    }
    
    public boolean push(T data) {
        return false;
    }
    
    public T pop() {
        return null;
    }
    
    public T peek() {
        return null;
    }
    
    public int size() {
        return 0;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    @Override
    public Stack clone() {
        return this;
    }
    
    @Override
    public int compareTo(Stack o) {
        return 0;
    }
    
}
