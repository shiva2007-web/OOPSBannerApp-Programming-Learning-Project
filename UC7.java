/**
 * OOPSBannerApp
 * UC7: Store Character Pattern using Inner Static Class
 * 
 * Author: Shiva
 * Version: 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store Character and Pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for Character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for Pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create Objects
        CharacterPatternMap o1 = new CharacterPatternMap('O', O);
        CharacterPatternMap o2 = new CharacterPatternMap('O', O);
        CharacterPatternMap p = new CharacterPatternMap('P', P);
        CharacterPatternMap s = new CharacterPatternMap('S', S);

        // Store in Array
        CharacterPatternMap[] word = {o1, o2, p, s};

        // Print Banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap ch : word) {
                line.append(ch.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}