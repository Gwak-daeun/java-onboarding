package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {

        List<Integer> answer = new ArrayList<>(9);

        int remaining; // 계산 후 남은 돈

        for (int i = 0; i < answer.size(); i++) {
            
        }

        if (money / 50000 != 0) { // 5만으로 나눴을 때 몫이 있다면
            answer.add(money / 50000);
            remaining = money % 50000;
        } else { // 5만으로 나눴을 때 몫이 없다면
            answer.add(0);
            remaining = money;
        }
        if (remaining / 10000 != 0) { // 1만으로 나눴을 때 몫이 있다면
            answer.add(remaining / 10000);
            remaining = remaining % 10000;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 5000 != 0) {
            answer.add(remaining / 5000);
            remaining = remaining % 5000;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 1000 != 0) {
            answer.add(remaining / 1000);
            remaining = remaining % 1000;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 500 != 0) {
            answer.add(remaining / 500);
            remaining = remaining % 500;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 100 != 0) {
            answer.add(remaining / 100);
            remaining = remaining % 100;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 50 != 0) {
            answer.add(remaining / 50);
            remaining = remaining % 50;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 10 != 0) {
            answer.add(remaining / 10);
            remaining = remaining % 10;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        if (remaining / 1 != 0) {
            answer.add(remaining / 1);
            remaining = remaining % 1;
        } else {
            answer.add(0);
            remaining = remaining;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(15000);
    }
}
