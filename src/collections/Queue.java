package collections;

import java.io.Serializable;

/**
 *
 * @author e.pottinger
 */
public class Queue <T> implements Serializable, Comparable<Queue> {

    private Node front;
    private Node back;
    private int length;
    
    public Queue() {
        front = back = null;
        length = 0;
    }
    public Queue(LinkedList list) {
        front = back = null;
        length = 0;
        for(int i = 0; i < list.size(); i++) {
            enqueue((T)list.get(i));
        }
    }
    public Queue(T[] array) {
        front = back = null;
        length = 0;
        for(int i = 0; i < array.length; i++) {
            enqueue(array[i]);
        }
    }
    public Queue(Stack stack) {
        front = back = null;
        length = 0;
        for(int i = 0; i < stack.size(); i++) {
            enqueue((T)stack.pop());
        }
    }
    
    public boolean enqueue(T data) {
        return false;
    }
    
    public T dequeue() {
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
    public int compareTo(Queue o) {
        return 69;
    }
     
}
