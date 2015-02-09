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
        // TODO code application logic here
    }
    
}
