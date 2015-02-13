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
        
        /* myTest1
                    5
        
           myTest2
                    _        
        */
        
        System.out.println(myKeyNode.isEmptyHuh() + " should be false");
        System.out.println(mtNode.isEmptyHuh() + " should be true");
        System.out.println(myTest1.isEmptyHuh() + " should be false");
        System.out.println(myTest2.isEmptyHuh() + " should be true");

               
        KeyNode node1 = new KeyNode (mtNode,3,mtNode);
        KeyNode node2 = new KeyNode (mtNode,7,mtNode);
        KeyNode head = new KeyNode(node1, 6, node2);
        FiniteSet myTest3 = new FiniteSet(head);
        
        KeyNode node3 = new KeyNode (mtNode, 4, mtNode);
        KeyNode node4 = new KeyNode (mtNode, 7, mtNode);
        KeyNode head2 = new KeyNode (node3, 5, node4);
        FiniteSet myTest4 = new FiniteSet(head2);
        
        KeyNode node5 = new KeyNode (mtNode, 4, mtNode);
        KeyNode node6 = new KeyNode (mtNode, 7, mtNode);
        KeyNode head3 = new KeyNode (node5, 5, node6);
        FiniteSet myTest5 = new FiniteSet(head3);
        /* myTest3
                            6
                           / \
                          3   7
        
           myTest4 and myTest5
                            5
                           / \
                          4   7 
        */
        System.out.println("empty myTest3 " +myTest3.empty() + " should be ");
        System.out.println("the cardinality of myTest3 is " + myTest3.cardinality() + " should be 3");
        System.out.println("the cardinality of myTest2 is " + myTest2.cardinality() + " should be 0");
        System.out.println("the cardinality of myTest1 is " + myTest1.cardinality() + " should be 1");
        System.out.println("the number 3 is a member of my Test3: " + myTest3.member(3) + " should be true");
        System.out.println("the number 8 is a member of my Test3: " + myTest3.member(8) + " should be false");
        System.out.println("the number 7 is a member of my Test3: " + myTest3.member(7) + " should be true");
        System.out.println("add 8 to Test3: " + myTest3.add(8) + " should be 3 6 7 8");
        System.out.println("add 8 to Test2: " + myTest2.add(8) + " should be 8");
        System.out.println("unite Test3 and Test1: " + myTest3.union(myTest1) + " should be 3 5 6 7");
        System.out.println("unite Test3 and Test4: " + myTest3.union(myTest4) + " should be 3 4 5 6 7");
        System.out.println("remove 6 from Test3: " + myTest3.remove(6) + " should be 3 7");
        System.out.println("inter of myTest1 and myTest3 is: " + myTest3.inter(myTest1) + " should be ");
        System.out.println("inter of myTest4 and myTest3 is: " + myTest3.inter(myTest4) + " should be 7 ");
        System.out.println("diff of myTest1 and myTest3 is: " + myTest3.diff(myTest1) + " should be 5");
        System.out.println("diff of myTest3 and myTest1 is: " + myTest1.diff(myTest3) + " should be 3 6 7");
        System.out.println("diff of myTest3 and myTest4 is: " + myTest4.diff(myTest3) + " should be 3 6");
        System.out.println("diff of myTest4 and myTest3 is: " + myTest3.diff(myTest4) + " should be 4 5");
        System.out.println("myTest1 is a subset of myTest3: " + myTest1.subset(myTest3) + " should be false");
        System.out.println("myTest4 is a subset of myTest3: " + myTest4.subset(myTest3) + " should be false");
        System.out.println("myTest4 is a subset of myTest5: " + myTest4.subset(myTest5) + " should be true");
        System.out.println("myTest1 is equal to myTest3: " + myTest1.equal(myTest3) + " should be false");
        System.out.println("myTest4 is equal to myTest3: " + myTest4.equal(myTest3) + " should be false");
        System.out.println("myTest4 is equal to myTest5: " + myTest4.equal(myTest5) + " should be true");
        Test randTest = new Test();
        System.out.println(randTest.testProperty1(1000, 100));


        // TODO code application logic here
    }
    
}
