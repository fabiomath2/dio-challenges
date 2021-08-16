package challenges.java.javadeveloper.solucaodeproblemascomjava;

import java.util.Scanner;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;
        StringBuilder greatestSubstring = new StringBuilder();

        while (scanner.hasNextLine()) {
            line = scanner.nextLine().trim().toLowerCase();

            String possiblyRepeatedPart = null;
            String possiblyEqualStr = null;
            String longestRepeatedStr = line;
            int factor = 1;

            for (int i = line.length() - 1; i >= (line.length() / 2); --i, ++factor) {
                if (i - factor >= 0) {
                    possiblyRepeatedPart = line.substring(i);
                    possiblyEqualStr = line.substring(i - factor, i);

                    if (possiblyEqualStr.equals(possiblyRepeatedPart)) {
                        longestRepeatedStr = possiblyEqualStr;
                    }
                }
            }

            String originalString = longestRepeatedStr;

            if (longestRepeatedStr.length() < line.length()) {
                int longestRepeatedStrLength = longestRepeatedStr.length();
                int firstRepetitionIndex = line.length() - longestRepeatedStrLength;

                for (int i = line.length() - (longestRepeatedStrLength * 2); i
                        - longestRepeatedStrLength >= 0; i -= longestRepeatedStrLength) {
                    if (line.substring(i - longestRepeatedStrLength, i).equals(longestRepeatedStr)) {
                        firstRepetitionIndex = i;
                    }
                }

                originalString = line.substring(0, firstRepetitionIndex);
            }

            System.out.println(originalString);

        }

        scanner.close();
    }
}
