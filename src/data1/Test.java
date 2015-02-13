/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

import java.lang.Math;

/**
 *
 * @author Cedric
 */
public class Test {

    public Test() {
    }

    public static FiniteSet randFiniteSet(int x) {
        Node newNode = new EmptyNode();
        for (int i = 0; i < x; i++) {
            int rand = (int) ((Math.round(100 * Math.random())));
            newNode = newNode.add(rand);
        }
        return new FiniteSet(newNode);
    }

    /*
     Property 1
     member (add t x) y = true <-> x = y \/ member t y = true
     Property 2
     member (union s s') x = true <-> member s x = true \/ member s' x = true
     */
    public String testProperty1(int t, int n) {
        for (int i = 0; i < t; i++) {
            int x = (int) ((Math.round(10 * Math.random())));
            int y = (int) ((Math.round(10 * Math.random())));
            Test randTest = new Test();
            FiniteSet tester1 = randTest.randFiniteSet(n);
            FiniteSet tester2 = tester1.add(x);
            if (tester2.member(y)) {
                if (tester1.member(y) || (x == y)) {
                } 
                else {
                    return ("you can't code, " + x + " and " + y + "fails with " + tester1 );
                }
            } 
            else {
                if (tester1.member(y) || (x == y)) {
                    return ("you can't code, " + x + " and " + y + "fails with " + tester1 );
                }
            }
        }
        return "hurray " + t + " tests worked";
    }
    
    

}


/*
 int max = 1000;
 int min = 0;
 Random rand = new Random();
 int randNum = rand.nextInt((max - min) + 1) + min;
 return randNum;
 */
