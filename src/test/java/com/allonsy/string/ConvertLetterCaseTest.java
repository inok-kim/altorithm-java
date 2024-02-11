package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertLetterCaseTest {

    ConvertLetterCase convertLetterCase = new ConvertLetterCase();

    @Test
    void test1() {
        String s = "StuDY";
        String answer = convertLetterCase.solution(s);
        Assertions.assertThat(answer).isEqualTo("sTUdy");
    }

    @Test
    void test2() {
        String s = "StuDY";
        String answer = convertLetterCase.solutionWithUnicode(s);
        Assertions.assertThat(answer).isEqualTo("sTUdy");
    }

}