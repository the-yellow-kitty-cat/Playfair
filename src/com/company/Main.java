package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
M R J O C
K T V Q U
Z P H D B
A G S F E
W L Y N X
 */

    private static char[][] keyMatrix = {
            {'m', 'r', 'i', 'o', 'c'},
            {'k', 't', 'v', 'q', 'u'},
            {'z', 'p', 'h', 'd', 'b'},
            {'a', 'g', 's', 'f', 'e'},
            {'w', 'l', 'y', 'n', 'x'}
            //  TODO  Fixa loop!

    };

    public static String encryptPair(String originalInput) {
        char firstOriginalLetter = originalInput.charAt(0);
        char secondOriginalLetter = originalInput.charAt(1);
//        1,0 = 'k'
        int firstRow = -1, firstColumn = -1;
        int secondRow = -1, secondColumn = -1;
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                char letterInMatrix = keyMatrix[row][column];
                if (letterInMatrix == firstOriginalLetter) {
                    firstRow = row;
                    firstColumn = column;
                }
                if (letterInMatrix == secondOriginalLetter) {
                    secondRow = row;
                    secondColumn = column;
                }
            }
        }
        int firstEncryptedRow = firstRow, firstEncryptedColumn = secondColumn;
        int secondEncryptedRow = secondRow, secondEncryptedColumn = firstColumn;
        if (firstColumn == secondColumn) {
            firstEncryptedRow = firstRow + 1;
            firstEncryptedColumn = firstColumn;
            secondEncryptedRow = secondRow + 1;
            secondEncryptedColumn = secondColumn;
        }

        if (firstRow == secondRow) {
            firstEncryptedRow = firstRow;
            firstEncryptedColumn = firstColumn + 1;
            secondEncryptedRow = secondRow;
            secondEncryptedColumn = secondColumn + 1;
        }


        char firstEncryptedLetter = keyMatrix[firstEncryptedRow][firstEncryptedColumn];
        char secondEncryptedLetter = keyMatrix[secondEncryptedRow][secondEncryptedColumn];

        return firstEncryptedLetter + "" + secondEncryptedLetter;
    }

    static String lettersOnly(String c) {
        return c.replaceAll("[^a-zA-Z]", "");
    }


    public static void main(String[] args) {

        // write your code here
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        s = in.nextLine();
        String encryptionToString = getPlayfairEncryption(s);
        System.out.println(encryptionToString);
    }

    public static String getPlayfairEncryption(String s) {
        s = lettersOnly(s);
        s = s.toLowerCase();
        ArrayList<String> letterPairs = new ArrayList<>();
        for (int currentLetter = 0; currentLetter < s.length(); currentLetter++) {
            int nextLetterPosition = currentLetter + 1;
            char originalLetter = (char) (s.charAt(currentLetter));
            char nextLetter;
            if (nextLetterPosition == s.length()) {
                nextLetter = 'x';
            } else {
                nextLetter = s.charAt(currentLetter + 1);
            }
            if (originalLetter == nextLetter) {
                nextLetter = 'x';
            } else {
                currentLetter++;
            }
            String nextTwoLetters = originalLetter + "" + nextLetter;
            letterPairs.add(nextTwoLetters);
        }
        StringBuilder encryption = new StringBuilder();
        letterPairs.forEach(pair -> {
            encryption.append(encryptPair(pair));
        });
        return encryption.toString();
    }
}

