package com.allonsy.string;

/**
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력 1
 * a#b!GE*T@S
 * 예시 출력 1
 * S#T!EG*b@a
 */
public class ReverseOnlyAlphabet {

    public String solution(String str) {
        String answer = "";
        char[] characters = str.toCharArray();
        int lt = 0;
        int rt = characters.length - 1;

        while (lt < rt) {
            char leftChar = characters[lt];
            char rightChar = characters[rt];

            while (!Character.isAlphabetic(leftChar) && lt < characters.length - 1) {
                leftChar = characters[++lt];
            }

            if (Character.isAlphabetic(leftChar) && lt == characters.length - 1) {
                break;
            }

            while (!Character.isAlphabetic(rightChar) && rt > 0) {
                rightChar = characters[--rt];
            }

            if (!Character.isAlphabetic(rightChar) && rt == 0) {
                break;
            }

            System.out.println("lt = " + lt);
            System.out.println("rt = " + rt);
            System.out.println("leftChar = " + leftChar);
            System.out.println("rightChar = " + rightChar);

            characters[lt] = rightChar;
            characters[rt] = leftChar;
            lt++;
            rt--;
        }
        answer = String.valueOf(characters);

        return answer;
    }

}
