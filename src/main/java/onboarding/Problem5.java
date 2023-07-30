package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {

        List<Integer> answer = new ArrayList<>();

        int remaining = money; // 계산 후 남은 돈

        int num = 50000;

        int[] arr = new int[]{2, 5, 10};

        for (int i = 0; i < 9; i++) { // 5, 2 나누기 반복. 마지막은 나누기 10

            if (i == 0){ // 0이면
                answer.add(remaining / 50000);
                remaining = remaining % 50000; // remaining : 237
            }
            if (i == 8) { // 마지막 1원 단위 계산
                answer.add(remaining / (num / arr[2]));
            }
            if (i != 0 && i % 2 == 1) { // 홀수면

                answer.add(remaining / (num / arr[i % 2])); // 0
                remaining = remaining % (num / arr[i % 2]); //
                num = num / arr[i % 2];
            }
            if (i != 0 && i % 2 == 0 && i != 8){ // 짝수면, 마지막 1의 자리가 아닐 때
                answer.add(remaining / (num / arr[i % 2]));
                remaining = remaining % (num / arr[i % 2]);
                num = num / arr[i % 2];
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(50237);
    }
}
