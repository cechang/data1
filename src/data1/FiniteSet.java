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
public class FiniteSet {
    Node head;
    
    FiniteSet() {
        EmptyNode mt = new EmptyNode();
        this.head = mt;
    }
    
    FiniteSet(Node head){
            this.head = head;
    }
    
    public boolean isEmptyHuh(){
        return this.head.isEmptyHuh();
    }
    
    public FiniteSet empty() {
        EmptyNode mt = new EmptyNode();
        FiniteSet newFS = new FiniteSet(mt);
        return newFS;
    }
  
}
