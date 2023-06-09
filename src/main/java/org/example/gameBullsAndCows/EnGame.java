package org.example.gameBullsAndCows;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{

    /**
     * @return - английский алфавит (список символов от a до z)
     */
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            charList.add(String.valueOf((char) i));
        }
        return charList;
    }
}
