package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {

        List<Integer> array = new ArrayList<>();

        int clap = 0; // 손뼉 횟수 초기화

        for (int i = 1; i <= number; i++) { //1부터 제시한 숫자 까지의 List 만들기
            array.add(i);
            String str = array.get(i - 1).toString();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                    clap++;
                    System.out.println("박수 : " + str);
                }
            }
        }


        System.out.println(clap);

        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        solution(13);
    }
}
