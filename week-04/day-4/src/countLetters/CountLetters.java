package countLetters;

import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

    public static void main(String[] args) {


        String input = "This is a nice spaceship";
        HashMap<Character, Integer> map = counterLettersDictionary(input);
        //Integer i = map.get('a');

        System.out.println(map);
    }



        public static HashMap<Character, Integer> counterLettersDictionary (String input){

            HashMap<Character, Integer> dictionary = new HashMap<>();
            String s1 = input.replaceAll(" ", "");
            s1 = s1.toLowerCase();

            char[] inputArray = s1.toCharArray();
            char[] sortedArray = s1.toCharArray();
            Arrays.sort(input.toCharArray());

            int counter = 0;
            for (char c : inputArray) {
                for (char s : sortedArray) {
                    if (c == s) {
                        counter++;
                    }
                }
                dictionary.put(c, counter);
                counter = 0;
            }
            return dictionary;


        }



}

//Write a function, that takes a string as an argument
// and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.
//Create a test for that.
