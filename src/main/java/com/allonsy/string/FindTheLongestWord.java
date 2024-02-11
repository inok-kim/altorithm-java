package com.allonsy.string;

/**
 * 설명
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 *
 * 단어를 답으로 합니다.
 *
 * 예시 입력 1
 * it is time to study
 * 예시 출력 1
 * study
 */
public class FindTheLongestWord {

    public String solution(String sentence) {
        String answer = "";
        int maxLength = Integer.MIN_VALUE;

        for (String s : sentence.split(" ")) {
            if(maxLength < s.length()) {
                maxLength = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public String solutionWithSubstring(String sentence) {
        String answer = "";
        int maxLength = Integer.MIN_VALUE;
        int pos = 0;

        while ((pos=sentence.indexOf(' ')) != -1) {
            String tmp = sentence.substring(0, pos);
            int len = tmp.length();
            if (maxLength < len) {
                maxLength = len;
                answer = tmp;
            }
            sentence = sentence.substring(pos + 1);
        }

        if(maxLength < sentence.length()) {
            answer = sentence;
        }

        return answer;
    }
}
