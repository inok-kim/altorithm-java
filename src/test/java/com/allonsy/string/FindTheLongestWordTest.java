package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLongestWordTest {

    FindTheLongestWord findTheLongestWord = new FindTheLongestWord();

    @Test
    void test1() {
        String s =  "it is time to study";
        String answer = findTheLongestWord.solution(s);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo("study");
    }

}