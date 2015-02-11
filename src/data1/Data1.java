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
        System.out.println("the number 3 is a member of my Test3: " + myTest3.member(3) + " should be true");
        System.out.println("the number 8 is a member of my Test3: " + myTest3.member(8) + " should be false");
        System.out.println("the number 7 is a member of my Test3: " + myTest3.member(7) + " should be true");
        System.out.println("the number 7 is a member of my Test3: " + myTest3.member(7) + " should be true");
        System.out.println("add 8 to Test3: " + myTest3.add(8) + " should be 3 6 7 8");
        System.out.println("unite Test3 and Test1: " + myTest3.union(myTest1) + " should be 3 5 6 7");
        System.out.println("remove 6 from Test3: " + myTest3.remove(6) + " should be 3 7");
        
        // TODO code application logic here
    }
    
}
