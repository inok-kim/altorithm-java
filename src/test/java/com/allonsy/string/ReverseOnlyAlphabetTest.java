package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyAlphabetTest {

    ReverseOnlyAlphabet reverseOnlyAlphabet = new ReverseOnlyAlphabet();

    @Test
    void test1() {
        String str = "a#b!GE*T@S";
        String answer = reverseOnlyAlphabet.solution(str);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo("S#T!EG*b@a");
    }

    @Test
    void test2() {
        String str = "&^*&@#$abcdef";
        String answer = reverseOnlyAlphabet.solution(str);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo("&^*&@#$fedcba");
    }

    @Test
    void test3() {
        String str = "&^*&@#";
        String answer = reverseOnlyAlphabet.solution(str);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo("&^*&@#");
    }

}