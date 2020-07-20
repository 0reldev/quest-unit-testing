package org.example;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {

        if (candidate.equals("") || candidate.equals(null)) {

            throw new IllegalArgumentException();
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String uniqueVowels(String candidate) {

        if (candidate.equals("") || candidate.equals(null)) {

            throw new IllegalArgumentException();
        }

        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {

            if (ALL_VOWELS.indexOf(letters[i]) >= 0
                && !(vowels.indexOf(letters[i]) >= 0)) {

                vowels += letters[i];
            }
        }
        return vowels;
    }


}

