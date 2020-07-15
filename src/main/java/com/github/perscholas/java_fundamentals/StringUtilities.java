package com.github.perscholas.java_fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.rmi.activation.ActivationGroup_Stub;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String outputString = "Hello World";
        return outputString;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String outputString = firstSegment + secondSegment;
        return outputString;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String outputString = String.valueOf(firstSegment) + secondSegment;
        return outputString;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String outputString = String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(1)) + String.valueOf(input.charAt(2));
        return outputString;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String reversedString = new StringBuilder(input).reverse().toString();
        String outputString = String.valueOf(reversedString.charAt(2)) + String.valueOf(reversedString.charAt(1)) + String.valueOf(reversedString.charAt(0));
        return outputString;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if (inputValue == comparableValue){
            return true;
        } else
        return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        if (inputValue.length() % 2 == 0){
            return inputValue.charAt((inputValue.length()/2)-1);
        } else
            return inputValue.charAt(inputValue.length()/2);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        String firstWord = words[0];
        return firstWord;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        String secondword = words[1];
        return secondword;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reversedString = new StringBuilder(stringToReverse).reverse().toString();
        return reversedString;
    }
}
