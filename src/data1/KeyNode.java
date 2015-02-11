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
    
    public int cardinality(){
        return 1 + this.left.cardinality() + this.right.cardinality();
    }
    
    public boolean member(int elt){
        if(elt == this.key){
            return true;
        }
        else if(elt > this.key){
            return this.right.member(elt);
        }
        else{
            return this.left.member(elt);
        }
    }
    
    public Node add(int elt){
        if(elt == this.key){
            return this;
        }
        else if(elt > this.key){
            return new KeyNode(this.left, this.key, this.right.add(elt));
        }
        else{
            return new KeyNode(this.left.add(elt), this.key, this.right);
        }
    }
    
    public String toString() {
        return this.left.toString() + " " +
                this.key + " " +
                this.right.toString();
    }
    
    public Node union(Node otherNode){
        Node newNode = otherNode.add(this.key);
        return (this.right.union(this.left)).union(newNode);
    }
    
    public Node remove(int elt){
        if(elt == this.key){
            return this.left.union(this.right);
        }
        else if(elt > this.key){
            return new KeyNode(this.left, this.key, this.right.remove(elt));
        }
        else{
            return new KeyNode(this.right.remove(elt), this.key, this.left);
        }
    }
    
    
}
