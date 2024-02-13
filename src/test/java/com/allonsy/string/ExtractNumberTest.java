package com.allonsy.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractNumberTest {

    ExtractNumber extractNumber = new ExtractNumber();

    @Test
    void test1() {
        String str = "g0en2T0s8eSoft";
        int answer = extractNumber.solution2(str);
        System.out.println("answer = " + answer);
        Assertions.assertThat(answer).isEqualTo(208);
    }

}