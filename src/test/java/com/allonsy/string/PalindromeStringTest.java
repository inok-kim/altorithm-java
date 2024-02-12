package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringTest {

    PalindromeString palindromeString = new PalindromeString();

    @Test
    void test1() {
        String str = "gooG";
        String answer = palindromeString.solution(str);
        Assertions.assertThat(answer).isEqualTo("YES");
    }

    @Test
    void test2() {
        String str = "aBcbA";
        String answer = palindromeString.solution(str);
        Assertions.assertThat(answer).isEqualTo("YES");
    }


    @Test
    void test3() {
        String str = "gooG";
        String answer = palindromeString.solutionWithStringBuilder(str);
        Assertions.assertThat(answer).isEqualTo("YES");
    }

    @Test
    void test4() {
        String str = "aBcbA";
        String answer = palindromeString.solutionWithStringBuilder(str);
        Assertions.assertThat(answer).isEqualTo("YES");
    }

    @Test
    void test_no1() {
        String str = "aBc";
        String answer = palindromeString.solution(str);
        Assertions.assertThat(answer).isEqualTo("NO");
    }

    @Test
    void test_no2() {
        String str = "cccd";
        String answer = palindromeString.solutionWithStringBuilder(str);
        Assertions.assertThat(answer).isEqualTo("NO");
    }

}