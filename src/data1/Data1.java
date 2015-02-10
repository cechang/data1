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
public class Data1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmptyNode mtNode = new EmptyNode();
        KeyNode myKeyNode = new KeyNode(mtNode, 5, mtNode);
        FiniteSet myTest1 = new FiniteSet(myKeyNode);
        FiniteSet myTest2 = new FiniteSet(mtNode);
        System.out.println(myKeyNode.isEmptyHuh() + " should be false");
        System.out.println(mtNode.isEmptyHuh() + " should be true");
        System.out.println(myTest1.isEmptyHuh() + " should be false");
        System.out.println(myTest2.isEmptyHuh() + " should be true");
        
        
        /* BST
                            6
                           / \
                          3   7
                         
        */        
        KeyNode node1 = new KeyNode (mtNode,3,mtNode);
        KeyNode node2 = new KeyNode (mtNode,7,mtNode);
        KeyNode head = new KeyNode(node1, 6, node2);
        FiniteSet myTest3 = new FiniteSet(head);
        System.out.println("the cardinality of myTest3 is " + myTest3.cardinality() + " should be 3");
        System.out.println("the cardinality of myTest2 is " + myTest2.cardinality() + " should be 0");
        System.out.println("the cardinality of myTest1 is " + myTest1.cardinality() + " should be 1");
        // TODO code application logic here
    }
    
}
