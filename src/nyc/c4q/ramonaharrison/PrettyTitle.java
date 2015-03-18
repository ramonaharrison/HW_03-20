package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * PrettyTitle.java
 */

public class PrettyTitle {
    public static void main(String[] args) {

        System.out.println(printTitle("a tale of two cities", '*'));

    }

    public static String printTitle(String title, char symbol) {

        return underline(capitalizedTitle(title), symbol);

    }

    public static String capitalizedTitle(String title) {

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
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }


    public static boolean smallWord(String word) {
        String[] smallWords = {"a", "an", "the", "for", "and", "nor", "but", "or", "yet", "so", "at", "around", "by", "after", "along", "from", "of", "on", "to", "with", "without"};

        for (int i = 0; i < smallWords.length; i++) {
            if (word.equals(smallWords[i]))
                return true;
        }

        return false;
    }


    public static String underline(String title, char symbol) {
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
