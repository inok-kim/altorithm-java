package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {

    ReverseWord reverseWord = new ReverseWord();

    @Test
    void test1() {
        String[] str = { "good", "Time", "Big" };
        List<String> answer = reverseWord.solution(3, str);
        Assertions.assertThat(answer).isEqualTo(Arrays.asList("doog", "emiT", "giB"));
    }

    @Test
    void test2() {
        String[] str = { "good", "Time", "Big" };
        List<String> answer = reverseWord.solutionWithSwap(3, str);
        Assertions.assertThat(answer).isEqualTo(Arrays.asList("doog", "emiT", "giB"));
    }

}