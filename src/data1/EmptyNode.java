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
public class EmptyNode implements Node{
    
    EmptyNode() {};
    
    public boolean isEmptyHuh() {
        return true;
    }
    
    public String toString() {
        return "";
    }
    
    public int cardinality(){
        return 0;
    }
    public boolean member(int elt){
        return false;
    }
    
    public Node add(int elt){
        Node newNode = new KeyNode(this, elt, this);
        return newNode;                
    }
    
    public Node union(Node otherNode){
        return otherNode;
    }
    
    public Node remove(int elt){
        return this;
    }
    
    public Node inter(Node otherNode){
        return this;
    }
    
    public Node diff(Node otherNode){
        return otherNode;
    }
    
    public boolean subset(Node otherNode){
        return true;
    }
    
    public boolean equal(Node otherNode){
        return true;
    }
}
