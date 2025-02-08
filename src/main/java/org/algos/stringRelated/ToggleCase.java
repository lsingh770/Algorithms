package org.algos.stringRelated;

public class ToggleCase {

    public static void main(String[] args){
        new ToggleCase().toggleStringCase("hEllO1 wOrlD32");
    }

    public void toggleStringCase(String input) {
        char[]  charArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else
                result.append(c);
        }
        System.out.println("Given: " + input);
        System.out.println("Resultant: " + result);
    }

}
