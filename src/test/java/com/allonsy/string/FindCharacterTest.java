package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindCharacterTest {

    FindCharacter findCharacter = new FindCharacter();

    @Test
    void test1() {
        String strings = "Computercooler";
        char c = 'c';
        int answer = findCharacter.solution(strings, c);
        Assertions.assertThat(answer).isEqualTo(2);
    }

}