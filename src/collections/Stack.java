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
        if(data == null) return false;
        try {
            Node<T> node = new Node<>(data);
            if(!isEmpty()) node.next = top;
            top = node;
            length++;
        } catch (OutOfMemoryError error) {
            System.out.println("Stack Overflow");
            return false;
        }
        return true;
    }
    
    public T pop() {
        if(isEmpty()) return null;
        else {
            length--;
            T data = peek();
            Node temp = top;
            top = top.next;
            temp.next = null;
            System.gc();
            return data;
        }
    }
    
    public T peek() {
        if(isEmpty()) return null;
        return (T)top.data;
    }
    
    public int size() {
        return length;
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    @Override
    public String toString() {
        if(isEmpty()) return "Empty Stack";
        else {
            String text = "Stack [";
            Node current = top;
            while(current != null) {
                text += current.toString() + ", ";
                current = current.next;
            }
            return text + "]";
        }
    }
    
    @Override
    public Stack clone() {
        Stack<T> stack1 = new Stack<>();
        Node current = top;
        while(current != null){
            T data = (T) current.data;
            current = current.next;
            stack1.push(data);
        }
        Stack<T> stack2 = new Stack<>();
        while(!stack1.isEmpty()) {
            T data = (T)stack1.pop();
            stack2.push(data);
        }
        return stack2;
    }
    
    @Override
    public int compareTo(Stack o) {
        return 0;
    }
    
}
