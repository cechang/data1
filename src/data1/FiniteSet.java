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
    
    public String toString(){
        return this.head.toString();
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public boolean isEmptyHuh(){
        return this.head.isEmptyHuh();
    }
    
    public FiniteSet empty() {
        EmptyNode mt = new EmptyNode();
        FiniteSet newFS = new FiniteSet(mt);
        return newFS;
    }
    
    public int cardinality(){
        return this.head.cardinality();
    }
    
    public boolean member(int elt){
        return this.head.member(elt);
    }
    
    public FiniteSet add(int elt){
        return new FiniteSet(this.head.add(elt));
    }
    
    public FiniteSet union(FiniteSet otherSet){
        return new FiniteSet(this.head.union(otherSet.getHead()));
    }
    
    public FiniteSet remove(int elt){
        return new FiniteSet(this.head.remove(elt));
    }
  
}
