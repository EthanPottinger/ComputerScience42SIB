package collections;

import java.io.Serializable;

/**
 *
 * @author e.pottinger
 */
public class TreeNode <T extends Comparable<T>> implements Serializable {
    
    public T data;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode() {
        this(null, null, null);
    }
    
    public TreeNode(T data) {
        this(data, null, null);
    }
    
    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public String toString() {
        return "TreeNode " + data.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        try {
            TreeNode treeNode = (TreeNode)object;
            return data.equals(treeNode.data);
        } catch(ClassCastException error) {
            System.out.println("TreeNode Casting error");
            return false;
        }
    }
    
    public boolean instert(T data) {
        if(data == null) return false;
        if(data.compareTo(this.data) < 0) {
            if(this.left == null) {
                this.left = new TreeNode(data);
            }
            else {
                this.left.instert(data);
            }
        }
        else if(data.compareTo(this.data) >= 0) {
            if(this.right == null) {
                this.right = new TreeNode(data);
            }
            else {
                this.right.instert(data);
            }
        }
        return true;
    }
    
}
