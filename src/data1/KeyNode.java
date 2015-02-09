/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

/**
 *
 * @author Cedric
 */
public class KeyNode implements Node{
    
    Node left;
    int key;
    Node right;
    
    KeyNode(Node left, int key, Node right){
        this.left = left;
        this.key = key;
        this.right = right;       
    }
    
    public boolean isEmptyHuh(){
        return false;
    }
    
}
