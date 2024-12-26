package org.algos.samples;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Write a program RandomWord.java that reads a sequence of words from standard input and prints one of those words uniformly at random. Do not store the words in an array or list. Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i
 *  to be the champion, replacing the previous champion. After reading all of the words, print the surviving champion.
 */
public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int i = 1;
        int numWordsToRead = 4; // Here we need to restrict the number of words to read as there is bug in `StdIn.isEmpty()`, it keeps reading input.

        // Loop until there's no more input
        while (i <= numWordsToRead) {
            String word = StdIn.readString();

            // Use StdRandom.bernoulli(p) to select with probability 1/i
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
            i++;
        }

        // Print the champion word (the one selected randomly)
        if (champion != null) {
            StdOut.println(champion);
        }
    }
}
