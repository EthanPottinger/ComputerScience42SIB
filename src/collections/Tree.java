package collections;

import java.io.Serializable;

/**
 *
 * @author e.pottinger
 */
public class Tree <T extends Comparable<T>> implements Serializable {
    
    private int size;
    private TreeNode<T> root;
    private LinkedList<T> list;
    private LinkedList<T> order;
    
    public Tree() {
        size = 0;
        root = null;
        list = new LinkedList<>();
        order = new LinkedList<>();
    }
    
}
