package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * PrettyTitle.java
 * This class prints a title with underlining and proper capitalization
 */

public class PrettyTitle {
    public static void main(String[] args) {

        System.out.println(printTitle("a tale of two cities", '*'));
    }

    public static String printTitle(String title, char symbol) {            // underlines the capitalized title

        return underline(capitalizeTitle(title), symbol);
    }

    public static String capitalizeTitle(String title) {                    // loops through each word in the title to select first, last, and important words for capitalization

        String[] split = title.split(" ");
        String capitalizedString = "";

        for (int i = 0; i < split.length; i++) {
            if (i > split.length - 2 || i < 1 || !smallWord(split[i]))
                capitalizedString += capitalize(split[i]) + " ";
            else
                capitalizedString += split[i] + " ";
        }

        return capitalizedString;
    }

    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);   // capitalizes a word
    }


    public static boolean smallWord(String word) {                          // checks for 'small words' that shouldn't be capitalized
        String[] smallWords = {"a", "an", "the", "for", "and", "nor", "but", "or", "yet", "so", "at", "around", "by", "after", "along", "from", "of", "on", "to", "with", "without"};

        for (int i = 0; i < smallWords.length; i++) {
            if (word.equals(smallWords[i]))
                return true;
        }

        return false;
    }


    public static String underline(String title, char symbol) {             // underlines the string
        String underline = "\n";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ')
                underline += ' ';
            else
                underline += symbol;
        }

        return title + underline;
    }

}
