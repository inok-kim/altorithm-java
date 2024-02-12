package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharacterTest {

    RemoveDuplicateCharacter removeDuplicateCharacter = new RemoveDuplicateCharacter();

    @Test
    void test1() {
        String str = "ksekkset";
        String answer = removeDuplicateCharacter.solution(str);
        Assertions.assertThat(answer).isEqualTo("kset");
    }

}