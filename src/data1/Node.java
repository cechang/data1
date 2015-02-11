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
public interface Node {
    public String toString();
    public boolean isEmptyHuh();
    public int cardinality();
    public boolean member(int elt);
    public Node add(int elt);
    public Node union(Node otherNode);
    public Node remove(int elt);
}
