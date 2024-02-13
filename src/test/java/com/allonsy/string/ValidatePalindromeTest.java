package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePalindromeTest {

    ValidatePalindrome validatePalindrome = new ValidatePalindrome();

    @Test
    void test1() {
        String word = "found7, time: study; Yduts; emit, 7Dnuof";
        String answer = validatePalindrome.solution(word);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo("YES");
    }

}