package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static String solution(String word) {

        List<Character> mom = new ArrayList<>(); // 엄마 알파벳 배열 선언
        List<Character> son = new ArrayList<>(); // 아들 알파벳 배열 선언

        char[] arr = word.toCharArray(); // 입력받은 단어와 비교해서 엄마 배열에 일치하는 값을 저장하는 배열

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println( "받은 단어 : "  + arr[i]);
//        }

        char[] num = new char[word.length()];

        List<Character> result = new ArrayList<>();

        int momIndex = 0;

        int sonIndex = 0;

        //mom 알파벳 배열(대문자 + 소문자)
        for (char i = 65; i <= 122; i++) {
            if (90 < i && i < 97) {
                continue;
            }
            mom.add(momIndex, i);
            momIndex++;
        }

        //son 알파벳 역순 배열(대문자 + 소문자)
        for (char i = 122; i >= 65; i--) {
            if (90 < i && i < 97) {
                continue;
            }
            if (i >= 65 && i <= 90) { // 대문자일 때 소문자로 바꿔서 저장
                int d = (int) i + 32;
                son.add(sonIndex, (char) d);
            }
            if (i >= 97 && i <= 122) { // 소문자일 때 대문자로 바꿔서 저장
                int d = (int) i - 32;
                son.add(sonIndex, (char) d);
            }
            sonIndex++;
        }

        //받은 문자열 엄마 배열과 비교해서 인덱스값 넣기
        for (int i = 0; i < word.length(); i++) {

            if (arr[i] == 32) { //띄어쓰기를 반영하기 위한 조건문. 32는 아스키코드에서 공백을 의미
                num[i] = 32;

            }
            for (int j = 0; j < mom.size(); j++) {
                if (arr[i] == mom.get(j)) {
                    num[i] = (char) j;
                }
            }
        }

        //엄마 인덱스가 저장된 배열을 아들 배열과 비교해서 값 넣기
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < son.size(); j++) {
                if (j == num[i]) {
                    result.add(i, son.get(j));
                    System.out.println("result에 들어간 값 : " + son.get(j));
                }
            }
            if (num[i] == 32) {
                result.add(i, (char) 32);
                System.out.println("추가한 공백 확인 : " + (char) 32);
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("result출력[ " + i + " ] : " + result.get(i));

        }

        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        solution("I love you");
    }
}
