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
        if(data == null) return false;
        try {
            Node<T> node = new Node<>(data);
            if(isEmpty()) front = back = node;
            else {
                node.next = back;
                back.previous = node;
                back = node;
            }
            length++;
        } catch (OutOfMemoryError error) {
            System.out.println("Queue Overflow");
            return false;
        }
        return true;
    }
    
    public T dequeue() {
        if(isEmpty()) return null;
        else {
            length--;
            T data = peek();
            if(front == back) front = back = null;
            else {
                Node temp = front.previous;
                front.previous = null;
                temp.next = null;
                front = temp;
            }
            System.gc();
            return data;
        }
    }
    
    public T peek() {
        return front();
    }
    
    public T front() {
        if(isEmpty()) return null;
        return (T)front.data;
    }
    
    public T back() {
        if(isEmpty()) return null;
        return (T)back.data;
    }
    
    public int size() {
        return length;
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    @Override
    public String toString() {
        if(isEmpty()) return "Empty Queue";
        else {
            String text = "Queue [";
            Node current = front;
            while(current != null) {
                text += current.toString() + ", ";
                current = current.next;
            }
            return text + "]";
        }
    }
    
    @Override
    public Queue clone() {
        Queue<T> queue = new Queue<>();
        Node current = front;
        while(current != null) {
            T data = (T)current.data;
            current = current.previous;
            queue.enqueue(data);
        }
        return queue;
    }
    
    @Override
    public int compareTo(Queue o) {
        return 69;
    }
     
}
