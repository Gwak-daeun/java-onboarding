package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static int solution(int number) {

        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= number; i++) { //1부터 제시한 숫자 까지의 List 만들기
            array.add(i);
        }

        System.out.println(array);


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        solution(13);
    }
}
