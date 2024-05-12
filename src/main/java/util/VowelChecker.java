package util;

public class VowelChecker {

    /*This method converts the input string to lower case and then checks
     if it matches a regular expression that looks for any of the vowels (a, e, i, o, u).
      If a match is found, it returns true, otherwise it returns false*/
    public boolean hasVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
