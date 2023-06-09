package org.example.gameBullsAndCows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Answer {
    private String userInput;
    private Integer cow;
    private Integer bull;
}
