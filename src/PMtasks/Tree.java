/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMtasks;

import javafx.scene.Node;

/**
 *
 * @author Rahimi
 */
public class Tree {

    int value;
    Node left;
    Node right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
    Tree(int value) {
        this.value = value;
        left = null;
        right = null;
    }

}
