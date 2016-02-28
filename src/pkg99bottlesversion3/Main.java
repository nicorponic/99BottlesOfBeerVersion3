/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg99bottlesversion3;

import java.text.MessageFormat;

/**
 *
 * @author N1CO
 */
public class Main {

    static String bottles(final int n) {
        return MessageFormat.format("{0,choice,0#No more bottles of beer on the wall\n\nBetter go to the store and buy some more.|1#One bottle of beer|2#{0} bottles of beer}", n);
    }

    public static void main(final String[] args) {
        String byob = bottles(99);
        for (int x = 99; x > 0;) {

            System.out.println(byob + " on the wall");
            System.out.println(byob);
            System.out.println("Take one down, pass it around");
            byob = bottles(--x);
            System.out.println(byob + " on the wall\n");
        }
    }
}
